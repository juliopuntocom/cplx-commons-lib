package factus.commons.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {

    private Metadata metadata;
    private T data;
}

