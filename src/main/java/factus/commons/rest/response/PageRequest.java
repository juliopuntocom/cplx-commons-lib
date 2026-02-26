package factus.commons.rest.response;

public record PageRequest(int page, int size) {

    public static PageRequest of(int page, int size) {
        return new PageRequest(
                Math.max(0, page),
                Math.clamp(size, 1, 100)
        );
    }
}
