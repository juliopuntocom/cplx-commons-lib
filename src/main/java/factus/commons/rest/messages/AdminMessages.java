package factus.commons.rest.messages;

/**
 * Mensajes constantes utilizados en los flujos administrativos de la aplicación.
 *
 * <p>Centraliza los textos de respuesta para operaciones de listado, actualización,
 * sincronización, menú, documentos de cliente y roles.</p>
 *
 * <p>Esta clase no debe ser instanciada.</p>
 */
public final class AdminMessages {

    /**
     * Constructor privado para evitar instanciación.
     */
    private AdminMessages() {}

    /**
     * Mensaje de éxito cuando un listado se obtiene correctamente.
     */
    public static final String LIST_OK = "Listado obtenido correctamente";

    /**
     * Mensaje cuando no se encontraron registros en un listado.
     */
    public static final String EMPTY_LIST = "No se encontraron registros";

    /**
     * Mensaje de éxito cuando un registro se guarda correctamente.
     */
    public static final String UPSERT_OK = "Registro guardado correctamente";

    /**
     * Mensaje de éxito cuando un registro se actualiza correctamente.
     */
    public static final String UPDATE_OK = "Registro actualizado correctamente";

    /**
     * Mensaje de éxito cuando una sincronización finaliza correctamente.
     */
    public static final String SYNC_OK = "Sincronización completada correctamente";

    /**
     * Mensaje de éxito cuando una operación masiva se ejecuta correctamente.
     */
    public static final String BULK_OK = "Operación masiva ejecutada correctamente";

    /**
     * Mensaje de éxito cuando el menú se obtiene correctamente.
     */
    public static final String MENU_OK = "Menú obtenido correctamente";

    /**
     * Mensaje cuando el usuario no tiene opciones de menú asignadas.
     */
    public static final String MENU_EMPTY = "No tienes opciones asignadas";

    /**
     * Mensaje de éxito cuando se obtiene el listado de documentos del cliente.
     */
    public static final String CUSTOMER_DOC_LIST_OK =
            "Listado de documentos del cliente";

    /**
     * Mensaje cuando el cliente no tiene documentos registrados.
     */
    public static final String CUSTOMER_DOC_EMPTY =
            "El cliente no tiene documentos registrados";

    /**
     * Mensaje de éxito cuando los documentos del cliente se actualizan correctamente.
     */
    public static final String CUSTOMER_DOC_UPDATED =
            "Documentos del cliente actualizados correctamente";

    /**
     * Mensaje de éxito cuando se obtiene el listado de roles del cliente.
     */
    public static final String ROLE_LIST_OK =
            "Listado de roles del cliente";

    /**
     * Mensaje cuando no se encontraron roles asociados al cliente.
     */
    public static final String ROLE_LIST_EMPTY =
            "No se encontraron roles para el cliente";
}