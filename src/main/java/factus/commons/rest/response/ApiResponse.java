package factus.commons.rest.response;


/**
 * Representa la estructura estándar de respuesta de la API.
 *
 * <p>Contiene metadatos asociados a la respuesta y el cuerpo de datos
 * devuelto por la operación.</p>
 *
 * @param <T> tipo de dato contenido en la respuesta
 */
public class ApiResponse<T> {

    /**
     * Metadatos de la respuesta, como código, mensaje u otra información adicional.
     */
    private Metadata metadata;

    /**
     * Datos devueltos por la operación.
     */
    private T data;

    /**
     * Obtiene los metadatos asociados a la respuesta.
     *
     * @return metadatos de la respuesta
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Obtiene los datos devueltos por la operación.
     *
     * @return datos de la respuesta
     */
    public T getData() {
        return data;
    }

    /**
     * Crea una nueva instancia de {@link ApiResponse}.
     *
     * @param metadata metadatos asociados a la respuesta
     * @param data datos devueltos por la operación
     */
    public ApiResponse(Metadata metadata, T data) {
        this.metadata = metadata;
        this.data = data;
    }
}
