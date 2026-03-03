package factus.commons.rest.response;

/**
 * Representa una solicitud de paginación.
 *
 * @param page índice de la página, comenzando desde {@code 0}
 * @param size cantidad de elementos por página
 */
public record PageRequest(int page, int size) {

    /**
     * Crea una solicitud de paginación asegurando valores válidos.
     *
     * <p>Si {@code page} es menor que {@code 0}, se reemplaza por {@code 0}.
     * Si {@code size} está fuera del rango permitido, se ajusta entre
     * {@code 1} y {@code 100}.</p>
     *
     * @param page índice de página solicitado
     * @param size tamaño de página solicitado
     * @return una solicitud de paginación con valores ajustados
     */
    public static PageRequest of(int page, int size) {
        return new PageRequest(
                Math.max(0, page),
                Math.clamp(size, 1, 100)
        );
    }
}