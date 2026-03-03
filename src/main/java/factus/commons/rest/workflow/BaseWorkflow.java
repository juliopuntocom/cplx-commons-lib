package factus.commons.rest.workflow;

import factus.commons.rest.response.ApiResponse;
import factus.commons.rest.response.Metadata;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.UriInfo;
import java.time.LocalDateTime;
import java.util.List;

import static factus.commons.rest.constants.Constants.SUCCESS;
/**
 * Clase base abstracta que centraliza utilidades comunes para construir
 * respuestas estándar de la API dentro de los workflows.
 *
 * <p>Proporciona métodos protegidos para generar respuestas exitosas,
 * respuestas de listado y validaciones de existencia de datos.</p>
 */
public abstract class BaseWorkflow {

    /**
     * Constructor protegido para clases que extienden este workflow base.
     */
    protected BaseWorkflow() {
        // Constructor por defecto
    }

    /**
     * Construye una respuesta exitosa con datos y mensaje personalizado.
     *
     * @param data dato que será retornado en la respuesta
     * @param message mensaje descriptivo de éxito
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo del dato retornado
     * @return respuesta estándar de la API con metadatos y datos
     */
    protected <T> ApiResponse<T> ok(
            T data,
            String message,
            UriInfo uriInfo
    ) {
        return new ApiResponse<>(
                new Metadata(
                        SUCCESS,
                        message,
                        LocalDateTime.now(),
                        uriInfo.getPath()
                ),
                data
        );
    }

    /**
     * Construye una respuesta exitosa sin contenido en el cuerpo.
     *
     * @param message mensaje descriptivo de éxito
     * @param uriInfo información de la URI de la solicitud actual
     * @return respuesta estándar de la API con metadatos y sin datos
     */
    protected ApiResponse<Void> ok(
            String message,
            UriInfo uriInfo
    ) {
        return new ApiResponse<>(
                new Metadata(
                        SUCCESS,
                        message,
                        LocalDateTime.now(),
                        uriInfo.getPath()
                ),
                null
        );
    }

    /**
     * Construye una respuesta exitosa para listados.
     *
     * <p>Si la lista es {@code null} o está vacía, retorna una lista vacía
     * junto con el mensaje indicado para ausencia de datos. En caso contrario,
     * retorna la lista original con el mensaje de éxito correspondiente.</p>
     *
     * @param data lista de datos a retornar
     * @param emptyMessage mensaje a mostrar cuando no existen registros
     * @param successMessage mensaje a mostrar cuando el listado contiene elementos
     * @param uriInfo información de la URI de la solicitud actual
     * @param <T> tipo de los elementos de la lista
     * @return respuesta estándar de la API con metadatos y lista de resultados
     */
    protected <T> ApiResponse<List<T>> okList(
            List<T> data,
            String emptyMessage,
            String successMessage,
            UriInfo uriInfo
    ) {
        boolean empty = (data == null || data.isEmpty());

        return new ApiResponse<>(
                new Metadata(
                        SUCCESS,
                        empty ? emptyMessage : successMessage,
                        LocalDateTime.now(),
                        uriInfo.getPath()
                ),
                empty ? List.of() : data
        );
    }

    /**
     * Valida que el dato requerido exista.
     *
     * <p>Si el valor recibido es {@code null}, lanza una excepción
     * {@link NotFoundException} con el mensaje proporcionado.</p>
     *
     * @param data dato a validar
     * @param message mensaje de error a utilizar si el dato no existe
     * @param <T> tipo del dato
     * @return el mismo dato si no es nulo
     * @throws NotFoundException si el dato es {@code null}
     */
    protected <T> T required(
            T data,
            String message
    ) {
        if (data == null) {
            throw new NotFoundException(message);
        }
        return data;
    }
}