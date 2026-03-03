package factus.commons.rest.response;

import java.util.List;
/**
 * Representa el resultado de una consulta paginada.
 *
 * @param content lista de elementos de la página actual
 * @param totalElements número total de elementos disponibles
 * @param totalPages número total de páginas calculadas
 * @param page número de página actual, comenzando desde {@code 0}
 * @param size cantidad de elementos por página
 * @param <T> tipo de los elementos contenidos en la página
 */
public record PageResult<T>(
        List<T> content,
        long totalElements,
        int totalPages,
        int page,
        int size
) {

    /**
     * Crea una instancia de {@link PageResult} calculando automáticamente
     * el número total de páginas.
     *
     * <p>Si {@code size} es menor o igual a {@code 0}, se asigna
     * {@code 1} como total de páginas.</p>
     *
     * @param content lista de elementos de la página actual
     * @param totalElements número total de elementos disponibles
     * @param page número de página actual, comenzando desde {@code 0}
     * @param size cantidad de elementos por página
     * @param <T> tipo de los elementos contenidos en la página
     * @return una instancia de {@link PageResult} con el total de páginas calculado
     */
    public static <T> PageResult<T> of(List<T> content, long totalElements, int page, int size) {
        int totalPages = size <= 0 ? 1 : (int) Math.ceil((double) totalElements / size);
        return new PageResult<>(content, totalElements, totalPages, page, size);
    }
}