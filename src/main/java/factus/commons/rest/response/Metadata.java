package factus.commons.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Metadata {

    private String status;
    private String message;
    private LocalDateTime timestamp;
    private String path;
}
