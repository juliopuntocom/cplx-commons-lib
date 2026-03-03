package factus.commons.rest.workflow;

import factus.commons.rest.messages.AdminMessages;
import factus.commons.rest.response.ApiResponse;
import jakarta.ws.rs.core.UriInfo;

import java.util.List;
/**
 * Clase base abstracta para flujos administrativos.
 *
 * <p>Proporciona métodos utilitarios para construir respuestas estándar de la API
 * en operaciones comunes como listados, guardado/actualización y operaciones masivas.</p>
 *
 * <p>Extiende {@link BaseWorkflow} para reutilizar la lógica común de construcción
 * de respuestas.</p>
 */
public abstract class AdminWorkflowBase extends BaseWorkflow {

    /**
     * Constructor protegido para clases que extienden este workflow administrativo.
     */
    protected AdminWorkflowBase() {
        // Constructor por defecto
    }

    /**
     * Construye una respuesta estándar para operaciones de listado utilizando
     * los mensajes por defecto definidos en {@link AdminMessages}.
     *
     * @param data lista de elementos a retornar
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo de los elementos de la lista
     * @return respuesta API con la lista de datos y mensajes por defecto
     */
    protected <T> ApiResponse<List<T>> listResponse(
            List<T> data,
            UriInfo uriInfo
    ) {
        return okList(
                data,
                AdminMessages.EMPTY_LIST,
                AdminMessages.LIST_OK,
                uriInfo
        );
    }

    /**
     * Construye una respuesta estándar para operaciones de listado utilizando
     * mensajes personalizados para los casos de lista vacía y listado exitoso.
     *
     * @param data lista de elementos a retornar
     * @param emptyMessage mensaje a mostrar cuando la lista esté vacía
     * @param successMessage mensaje a mostrar cuando el listado se obtiene correctamente
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo de los elementos de la lista
     * @return respuesta API con la lista de datos y mensajes personalizados
     */
    protected <T> ApiResponse<List<T>> listResponse(
            List<T> data,
            String emptyMessage,
            String successMessage,
            UriInfo uriInfo
    ) {
        return okList(
                data,
                emptyMessage,
                successMessage,
                uriInfo
        );
    }

    /**
     * Construye una respuesta estándar para operaciones de guardado o actualización
     * utilizando un mensaje personalizado.
     *
     * @param data dato retornado en la respuesta
     * @param message mensaje de éxito personalizado
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo del dato retornado
     * @return respuesta API con el dato y el mensaje indicado
     */
    protected <T> ApiResponse<T> upsertResponse(
            T data,
            String message,
            UriInfo uriInfo
    ) {
        return ok(
                data,
                message,
                uriInfo
        );
    }

    /**
     * Construye una respuesta estándar para operaciones de guardado o actualización
     * utilizando el mensaje por defecto definido en {@link AdminMessages#UPSERT_OK}.
     *
     * @param data dato retornado en la respuesta
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo del dato retornado
     * @return respuesta API con el dato y el mensaje por defecto de operación exitosa
     */
    protected <T> ApiResponse<T> upsertResponse(
            T data,
            UriInfo uriInfo
    ) {
        return ok(
                data,
                AdminMessages.UPSERT_OK,
                uriInfo
        );
    }

    /**
     * Construye una respuesta estándar para operaciones masivas exitosas.
     *
     * @param uriInfo información de la URI de la solicitud actual
     * @return respuesta API sin contenido y con mensaje de operación masiva exitosa
     */
    protected ApiResponse<Void> bulkResponse(UriInfo uriInfo) {
        return ok(
                AdminMessages.BULK_OK,
                uriInfo
        );
    }
}