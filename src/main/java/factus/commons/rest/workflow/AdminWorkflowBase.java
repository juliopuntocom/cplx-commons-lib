package factus.commons.rest.workflow;

import factus.commons.rest.messages.AdminMessages;
import factus.commons.rest.response.ApiResponse;
import jakarta.ws.rs.core.UriInfo;

import java.util.List;

public abstract class AdminWorkflowBase extends BaseWorkflow {

    protected <T> ApiResponse<List<T>> listResponse(
            List<T> data,
            UriInfo uriInfo
    ) {
        return okList(
                data,
                AdminMessages.EMPTY_LIST,
                AdminMessages.LIST_OK,
                uriInfo
        );
    }
    protected <T> ApiResponse<List<T>> listResponse(
            List<T> data,
            String emptyMessage,
            String successMessage,
            UriInfo uriInfo
    ) {
        return okList(
                data,
                emptyMessage,
                successMessage,
                uriInfo
        );
    }
    protected <T> ApiResponse<T> upsertResponse(
            T data,
            String message,
            UriInfo uriInfo
    ) {
        return ok(
                data,
                message,
                uriInfo
        );
    }
    protected <T> ApiResponse<T> upsertResponse(
            T data,
            UriInfo uriInfo
    ) {
        return ok(
                data,
                AdminMessages.UPSERT_OK,
                uriInfo
        );
    }

    protected ApiResponse<Void> bulkResponse(UriInfo uriInfo) {
        return ok(
                AdminMessages.BULK_OK,
                uriInfo
        );
    }
}
