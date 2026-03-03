package factus.commons.rest.response;

import java.time.LocalDateTime;

/**
 * Representa los metadatos estándar incluidos en una respuesta de la API.
 *
 * <p>Contiene información sobre el estado de la operación, el mensaje asociado,
 * la fecha y hora de generación de la respuesta, y la ruta del endpoint
 * procesado.</p>
 */
public class Metadata {

    /**
     * Estado de la respuesta, por ejemplo {@code SUCCESS} o {@code ERROR}.
     */
    private String status;

    /**
     * Mensaje descriptivo asociado al resultado de la operación.
     */
    private String message;

    /**
     * Fecha y hora en la que se generó la respuesta.
     */
    private LocalDateTime timestamp;

    /**
     * Ruta del endpoint que procesó la solicitud.
     */
    private String path;

    /**
     * Crea una nueva instancia de {@link Metadata}.
     *
     * @param status estado de la respuesta
     * @param message mensaje descriptivo asociado a la operación
     * @param timestamp fecha y hora de generación de la respuesta
     * @param path ruta del endpoint procesado
     */
    public Metadata(String status, String message, LocalDateTime timestamp, String path) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
        this.path = path;
    }

    /**
     * Obtiene el estado de la respuesta.
     *
     * @return estado de la respuesta
     */
    public String getStatus() {
        return status;
    }

    /**
     * Obtiene el mensaje asociado a la respuesta.
     *
     * @return mensaje descriptivo de la respuesta
     */
    public String getMessage() {
        return message;
    }

    /**
     * Obtiene la fecha y hora de generación de la respuesta.
     *
     * @return fecha y hora de la respuesta
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Obtiene la ruta del endpoint procesado.
     *
     * @return ruta del endpoint
     */
    public String getPath() {
        return path;
    }
}