package factus.commons.rest.response;

public record PageResult<T>(
        java.util.List<T> items,
        int total,
        int page,
        int size
) {}
