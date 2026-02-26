package factus.commons.rest.workflow;

import factus.commons.rest.response.ApiResponse;
import factus.commons.rest.response.Metadata;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.UriInfo;
import java.time.LocalDateTime;
import java.util.List;

import static factus.commons.rest.constants.Constants.SUCCESS;

public abstract class BaseWorkflow {

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
