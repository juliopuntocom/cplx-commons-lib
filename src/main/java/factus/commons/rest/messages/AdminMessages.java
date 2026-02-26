package factus.commons.rest.messages;

public final class AdminMessages {

    private AdminMessages() {}

    // LISTADOS
    public static final String LIST_OK = "Listado obtenido correctamente";
    public static final String EMPTY_LIST = "No se encontraron registros";

    // UPSERT
    public static final String UPSERT_OK = "Registro guardado correctamente";

    // DELETE / REPLACE
    public static final String UPDATE_OK = "Registro actualizado correctamente";

    // SECURITY
    public static final String SYNC_OK = "Sincronización completada correctamente";
    public static final String BULK_OK = "Operación masiva ejecutada correctamente";

    // MENU
    public static final String MENU_OK = "Menú obtenido correctamente";
    public static final String MENU_EMPTY = "No tienes opciones asignadas";

    // CUSTOMER DOCUMENTS
    public static final String CUSTOMER_DOC_LIST_OK =
            "Listado de documentos del cliente";
    public static final String CUSTOMER_DOC_EMPTY =
            "El cliente no tiene documentos registrados";
    public static final String CUSTOMER_DOC_UPDATED =
            "Documentos del cliente actualizados correctamente";

    // KEYCLOAK ROLES
    public static final String ROLE_LIST_OK =
            "Listado de roles del cliente";
    public static final String ROLE_LIST_EMPTY =
            "No se encontraron roles para el cliente";
}
