package factus.commons.rest.constants;

import java.util.Set;
import java.util.regex.Pattern;

/**
 * Clase de Constants
 */
public final class Constants {
    /**
     * Cannot instantiate Constants class
     */
    private Constants() {
        throw new AssertionError("Cannot instantiate Constants class");
    }
    /*** SUCCESS */
    public static final String SUCCESS = "SUCCESS";
    /*** PENDIENTE */
    public static final String PENDIENTE = "PENDIENTE";
    /*** perufirma */
    public static final Set<String> ALLOWED = Set.of("pos","pse","ose","aduana","perufirma");
    /*** ORIGIN_DEFAULT */
    public static final String ORIGIN_DEFAULT = "PUBLIC";
    /*** STATUS_ONB */
    public static final String STATUS_ONB = "ABIERTO";
    /*** ALLOWED_STATUS */
    public static final java.util.Set<String> ALLOWED_STATUS = java.util.Set.of(STATUS_ONB,"EN_PROCESO","GO_LIVE","CERRADO","CANCELADO");
    /*** RUC_REQUIRED */
    public static final String RUC_REQUIRED = "ruc is required";
    /*** PRODUCT_SELECT_1 */
    public static final String PRODUCT_SELECT_1 = "Debe seleccionar al menos 1 producto";
    /*** PRODUCT_INVALID */
    public static final String PRODUCT_INVALID = "Producto inválido: ";
    /*** SEND_DOCUMENT */
    public static final String SEND_DOCUMENT = "Debe enviar documentos";
    /*** DOCUMENT_REQUIRED */
    public static final String DOCUMENT_REQUIRED = "documentTypeId is required";
    /*** DOCUMENT_REQUIRED_FILE */
    public static final String DOCUMENT_REQUIRED_FILE = "Archivo requerido para documentTypeId=";
    /*** REQUEST_NOT_EXIST */
    public static final String REQUEST_NOT_EXIST = "No se generó id_request";
    /*** UNBOARDING_NOT_EXIST */
    public static final String UNBOARDING_NOT_EXIST = "No se generó id_onboarding";
    /*** FILE_NAME_UNBOARDING */
    public static final String FILE_NAME_UNBOARDING = "onboarding/";
    /*** EXIST_REQUEST_RUC */
    public static final String EXIST_REQUEST_RUC = "Ya existe una solicitud para el RUC=";
    /*** STATUS_PENDING */
    public static final String STATUS_PENDING = " en estado PENDIENTE";
    /*** DOCUMENT_NOT_FOUND */
    public static final String DOCUMENT_NOT_FOUND = "Documento no encontrado";
    /*** STATE_MUST_NULL */
    public static final String STATE_MUST_NULL = "state must not be null or blank";
    /*** RUC_INVALID */
    public static final String RUC_INVALID = "RUC inválido. Debe tener 11 dígitos.";
    /*** REGEX_RUC */
    public static final String REGEX_RUC = "^\\d{11}$";
    /*** APPLICATION_FILE */
    public static final String APPLICATION_FILE = "application/octet-stream";
    /*** APPLICATION_PDF */
    public static final String APPLICATION_PDF = "application/pdf";
    /*** TYPE_DOCUMENT_PNG */
    public static final String TYPE_DOCUMENT_PNG = "image/png";
    /*** TYPE_DOCUMENT_JPEG */
    public static final String TYPE_DOCUMENT_JPEG = "image/jpeg";
    /*** DOCUMENT_PDF */
    public static final String DOCUMENT_PDF = ".pdf";
    /*** DOCUMENT_PNG */
    public static final String DOCUMENT_PNG = ".png";
    /*** DOCUMENT_JPG */
    public static final String DOCUMENT_JPG = ".jpg";
    /*** DOCUMENT_JPEG */
    public static final String DOCUMENT_JPEG = ".jpeg";
    /*** INLINE */
    public static final String INLINE = "inline";
    /*** CONTENT_DISPOSITION */
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    /*** INLINE_FILENAME */
    public static final String INLINE_FILENAME = "inline; filename=\"";
    /*** CONTENT_LENGTH */
    public static final String CONTENT_LENGTH = "Content-Length";
    /*** TASK_ONBOARDING */
    public static final String TASK_ONBOARDING=  "Tareas del onboarding";
    /*** TASK_CREATE */
    public static final String TASK_CREATE=  "Tarea creada";
    /*** TASK_UPDATE */
    public static final String TASK_UPDATE=  "Tarea actualizada";
    /*** TASK_DELETE */
    public static final String TASK_DELETE=  "Tarea eliminada";
    /*** ONBOARDING_CREATE */
    public static final String ONBOARDING_CREATE=  "Onboarding creado";
    /*** ONBOARDING_DETAIL */
    public static final String ONBOARDING_DETAIL=  "Detalle onboarding";
    /*** ONBOARDING_NOT_FOUND_ALL */
    public static final String ONBOARDING_NOT_FOUND_ALL=  "No hay onboardings";
    /*** ONBOARDING_LIST */
    public static final String ONBOARDING_LIST=  "Listado onboardings";
    /*** ONBOARDING_UPDATE */
    public static final String ONBOARDING_UPDATE=  "Onboarding actualizado";
    /*** MSG_NOT_FOUND */
    public static final String MSG_NOT_FOUND =  "Contract not found";
    /**
     * Onboarding not found
     */
    public static final String MSG_ONB_NOT_FOUND =  "Onboarding not found";
    /*** NOT_FOUND */
    public static final String NOT_FOUND = "NOT_FOUND";
    /*** USED */
    public static final String USED = "USED";
    /*** EXPIRED */
    public static final String EXPIRED = "EXPIRED";
    /*** MSG_OK */
    public static final String MSG_OK = "OK";
    /*** COD_SHA */
    public static final String COD_SHA = "SHA-256";
    /*** BYTE_CODE */
    public static final String BYTE_CODE = "%02x";
    /*** SHA_NOT_AVAILABLE */
    public static final String SHA_NOT_AVAILABLE = "SHA-256 no disponible en el runtime";
    /*** NOT_HASH_TOKEN */
    public static final String NOT_HASH_TOKEN = "No se pudo hashear token";
    /*** TOKEN_REQUIRED */
    public static final String TOKEN_REQUIRED = "token required";
    /*** TOKEN_INVALID */
    public static final String TOKEN_INVALID = "Token inválido, expirado o ya usado";
    /*** BODY_REQUIRED */
    public static final String BODY_REQUIRED = "body required";
    /*** TITLE_REQUIRED */
    public static final String TITLE_REQUIRED = "titulo required";
    /*** REQUEST_ID_REQUIRED */
    public static final String REQUEST_ID_REQUIRED = "requestId required";
    /*** CUSTOMER_ID_REQUIRED */
    public static final String CUSTOMER_ID_REQUIRED = "customerId required";
    /*** REQUEST_NOT_FOUND */
    public static final String REQUEST_NOT_FOUND = "Request not found";
    /*** REQUEST_MUST_APROBADO */
    public static final String REQUEST_MUST_APROBADO = "Request must be APROBADO";
    /*** MSG_OBSERVER */
    public static final String MSG_OBSERVER = "Observado";
    /*** CONTRACT_NOT_FOUND */
    public static final String CONTRACT_NOT_FOUND = "Contract not found for onboarding=";
    /*** STATUS_INVALID */
    public static final String STATUS_INVALID= "estado inválido";
    /*** STATUS_IS_REQUIRED */
    public static final String STATUS_IS_REQUIRED= "estado is required";
    /*** BASE64_IS_REQUIRED */
    public static final String BASE64_IS_REQUIRED= "base64File es requerido";
    /*** FILENAME_IS_REQUIRED */
    public static final String FILENAME_IS_REQUIRED= "fileName es requerido";
    /*** CONTENT_TYPE_IS_REQUIRED */
    public static final String CONTENT_TYPE_IS_REQUIRED= "contentType es requerido";
    /*** ONBOARDING_NOT_FOUND */
    public static final String ONBOARDING_NOT_FOUND= "Onboarding no encontrado para requestId=";
    /*** DOCUMENT_ID_NOT_FOUND */
    public static final String DOCUMENT_ID_NOT_FOUND= "Documento no encontrado idDocument=";
    /*** DOCUMENT_NOT_REQUEST */
    public static final String DOCUMENT_NOT_REQUEST= "El documento no pertenece al request indicado";
    /*** BASE64_IS_INVALID */
    public static final String BASE64_IS_INVALID= "base64File inválido";
    /*** ERROR_HTTP */
    public static final String  ERROR_HTTP = "Error HTTP ";
    /*** EX_ERROR */
    public static final String  EX_ERROR = "ERROR";
    /*** INTERNAL_ERR */
    public static final String  INTERNAL_ERR = "Internal server error";
    /*** PERSISTENCE_ERROR */
    public static final String  PERSISTENCE_ERROR = "PERSISTENCE_ERROR";
    /*** DATA_INVALID */
    public static final String  DATA_INVALID = "Datos inválidos";
    /*** DB_EXIST_FAILED */
    public static final String DB_EXIST_FAILED=  "DB exists failed";
    /*** DB_UPDATE_FAILED */
    public static final String DB_UPDATE_FAILED=  "DB update failed";
    /*** DB_QUERY_FAILED */
    public static final String DB_QUERY_FAILED=  "DB query failed";
    /*** ID_FIELD */
    public static final String ID_FIELD=  "id";
    /*** DELETED */
    public static final String DELETED=  "deleted";
    /*** STATE */
    public static final String STATE=  "state";
    /*** SUB_DOMAIN */
    public static final String SUB_DOMAIN=  "subDomain";
    /*** USER_TRADE */
    public static final String USER_TRADE=  "userTrade";
    /*** USER_SUPPORT */
    public static final String USER_SUPPORT=  "userSupport";
    /*** COMPANY_NAME */
    public static final String COMPANY_NAME=  "companyName";
    /*** PRIORITY */
    public static final String PRIORITY=  "priority";
    /*** ASC_PAG */
    public static final String ASC_PAG=  "asc";
    /*** DESC_PAG */
    public static final String DESC_PAG=  "desc";
    /*** REQUEST_ID */
    public static final String REQUEST_ID=  "requestId";
    /*** REQUEST */
    public static final String REQUEST=  "request";
    /*** CTX_CUSTOMER_ID */
    public static final String CTX_CUSTOMER_ID=  "ctxCustomerId";
    /*** CUSTOMER_ID */
    public static final String CUSTOMER_ID=  "customerId";
    /*** DATE_GO_LIVE */
    public static final String DATE_GO_LIVE=  "dateGoLive";
    /*** ALLOWED_SORT_FIELDS */
    public static final Set<String> ALLOWED_SORT_FIELDS = Set.of(
            ID_FIELD, PRIORITY, DATE_GO_LIVE, CUSTOMER_ID, SUB_DOMAIN, USER_TRADE, USER_SUPPORT

    );
    /*** ONBOARDING_DOCUMENT_NOT_FOUND */
    public static final String ONBOARDING_DOCUMENT_NOT_FOUND=  "Onboarding document not found. id=";
    /*** NOT_CHANGE_STATUS */
    public static final String NOT_CHANGE_STATUS=  "No se puede cambiar estado. Estado actual=";
    /*** PERMIT_ONLY_PENDING */
    public static final String PERMIT_ONLY_PENDING=  " (solo permitido desde PENDIENTE)";
    /*** STATUS_INVALID_DESTINATION */
    public static final String STATUS_INVALID_DESTINATION=  "Estado destino inválido: ";
    /*** OBSERVER_REQUIRED */
    public static final String OBSERVER_REQUIRED=  "La observación es obligatoria cuando el documento es OBSERVADO";
    /*** TASK_NOT_FOUND */
    public static final String TASK_NOT_FOUND=  "Task not found";
    /*** TOKEN_HASH */
    public static final String TOKEN_HASH=  "tokenHash";

    /**
     * DOCUMENT_OBSERVER
     */
    public static final String DOCUMENT_OBSERVER=  "DOCUMENTO OBSERVADO";
    /*** DOCUMENT_OBSERVER_ID */
    public static final String DOCUMENT_OBSERVER_ID=  "Se observó el documento id=";
    /*** UPLOAD_AGAIN */
    public static final String UPLOAD_AGAIN=  ". Debe corregirse y volver a subirlo.";
    /*** APPROVED_DOCS_ONBOARDING */
    public static final String APPROVED_DOCS_ONBOARDING=  "Approved docs onboarding=%s approved=%s";
    /*** APPROVED_DOCUMENT */
    public static final String APPROVED_DOCUMENT=  "SE HAN APROBADO LOS DOCUMENTOS";
    /*** DOCUMENT_APPROVED_3 */
    public static final String DOCUMENT_APPROVED_3=  "Los 3 documentos requeridos fueron aprobados.";
    /*** APPROVED_SOLICITUDE */
    public static final String APPROVED_SOLICITUDE=  "SE HA APROBADO LA SOLICITUD";
    /*** MSG_APPROVED_SOLICITUDE */
    public static final String MSG_APPROVED_SOLICITUDE=  "La solicitud fue aprobada y puede continuar el flujo.";
    /*** USER_ENTITY_NOT_FOUND */
    public static final String USER_ENTITY_NOT_FOUND=  "user_entity not found username=";
    /*** USERNAME_SEARCH */
    public static final String USERNAME_SEARCH=  "username";
    /*** NOT_FOUND_ONBOARDING */
    public static final String NOT_FOUND_ONBOARDING=  "No hay onboardings";
    /*** LIST_ONBOARDING */
    public static final String LIST_ONBOARDING=  "Listado de onboardings";
    /*** CONTRACT_UPDATE */
    public static final String CONTRACT_UPDATE=  "Contrato actualizado";
    /*** CONTRACT */
    public static final String CONTRACT=  "Contrato";
    /*** CONTRACT_SEND */
    public static final String CONTRACT_SEND=  "Contrato enviado";
    /*** CONTRACT_SIGNED */
    public static final String CONTRACT_SIGNED=  "Contrato firmado";
    /*** CONTRACT_OBSERVER */
    public static final String CONTRACT_OBSERVER=  "Contrato observado";
    /*** DOCUMENTS_NOT_FOUND */
    public static final String DOCUMENTS_NOT_FOUND=  "No hay documentos";
    /*** DOCUMENTS_ONBOARDING */
    public static final String DOCUMENTS_ONBOARDING=  "Documentos del onboarding";
    /*** DOCUMENTS_UPDATE */
    public static final String DOCUMENTS_UPDATE=  "Documentos actualizados";
    /*** DOCUMENTS_STATUS_UPDATE */
    public static final String DOCUMENTS_STATUS_UPDATE=  "Estado de documento actualizado";
    /*** URL_GENERATED */
    public static final String URL_GENERATED=  "URL generada correctamente";
    /*** NOT_FOUND_PENDING_REQUEST */
    public static final String NOT_FOUND_PENDING_REQUEST=  "No hay solicitudes pendientes";
    /*** PENDING_REQUEST */
    public static final String PENDING_REQUEST=  "Solicitudes pendientes";
    /*** CREATE_REQUEST */
    public static final String CREATE_REQUEST=  "Solicitud creada";
    /*** NOT_FOUND_REQUEST */
    public static final String NOT_FOUND_REQUEST=  "No hay solicitudes";
    /*** LIST_REQUEST */
    public static final String LIST_REQUEST=  "Listado de solicitudes";
    /*** DETAIL_REQUEST */
    public static final String DETAIL_REQUEST=  "Detalle solicitud";
    /*** UPDATE_REQUEST */
    public static final String UPDATE_REQUEST=  "Solicitud actualizada";
    /*** LINK_GENERATE */
    public static final String LINK_GENERATE=  "Link generado";
    /*** STATUS_LINK */
    public static final String STATUS_LINK=  "Estado del link";
    /*** CREATE_REQUEST_TOKEN */
    public static final String CREATE_REQUEST_TOKEN=  "Solicitud creada (token consumido)";
    /*** REQUEST_NOT_FOUND_RUC */
    public static final String REQUEST_NOT_FOUND_RUC=  "Request not found for ruc: ";
    /*** REQUEST_DETAIL_RUC */
    public static final String REQUEST_DETAIL_RUC=  "Detalle solicitud por RUC";
    /*** DOCUMENT_UPDATE */
    public static final String DOCUMENT_UPDATE=  "Documento actualizado";

    /**
     * MANAGEMENT
     */
    /*** CUSTOMERS_ID */
    public static final String  CUSTOMERS_ID = "customer_id";
    /*** EMAIL_REQUIRED */
    public static final String  EMAIL_REQUIRED = "Email es obligatorio";
    /*** EMAIL_EXIST */
    public static final String  EMAIL_EXIST = "Email ya existe. Email debe ser único";
    /*** USERNAME_REQUIRED */
    public static final String  USERNAME_REQUIRED = "Username es obligatorio";
    /*** PASSWORD_MINIM */
    public static final String  PASSWORD_MINIM = "Password mínimo 8 caracteres";
    /*** CREATED */
    public static final String  CREATED = "CREATED";
    /*** OK_TOTAL */
    public static final String  OK_TOTAL = "OK (total=";
    /*** NO_CONTENT */
    public static final String  NO_CONTENT = "NO_CONTENT";
    /*** RUC_REGEX */
    public static final String  RUC_REGEX = "\\d{11}";
    /*** ROLE_SUPER_ADMIN */
    public static final String  ROLE_SUPER_ADMIN = "ADMIN_CPLX";
    /*** APPROVED */
    public static final String  APPROVED = "APROBADO";
    /*** RUC_CLAIM_NAME */
    public static final String  RUC_CLAIM_NAME = "ruc";
    /*** AVATAR_NAME */
    public static final String  AVATAR_NAME = "avatar";
    /*** CLIENT_ID_KEKCLOAK */
    public static final String  CLIENT_ID_KEKCLOAK = "api-app";
    /*** ADMIN_CREATED */
    public static final String  ADMIN_CREATED = "Admin creado";
    /*** NOT_FOUND_ADMIN */
    public static final String  NOT_FOUND_ADMIN = "No hay admins";
    /*** LIST_ADMIN */
    public static final String  LIST_ADMIN = "Lista de admins";
    /*** NAME_GROUP */
    public static final String  NAME_GROUP = "name";
    /*** ID_GROUP */
    public static final String  ID_GROUP = "id";
    /*** COD_E403 */
    public static final String  COD_E403 = "E403";
    /*** COD_400 */
    public static final String  COD_400 = "E400";
    /*** COD_409 */
    public static final String  COD_409 = "ONB_409";
    /*** COD_500 */
    public static final String  COD_500 = "GEN_500";
    /*** HTTP_STATUS */
    public static final String  HTTP_STATUS = "HTTP_";
    /*** ERROR_FIELD */
    public static final String  ERROR_FIELD = "field";
    /*** COD_404 */
    public static final String  COD_404 = "ONB_404";
    /*** NO_REQUEST_RUC */
    public static final String  NO_REQUEST_RUC = "No existe solicitud de onboarding para el RUC=";
    /*** NEED_REGISTER */
    public static final String  NEED_REGISTER = ". Debe registrarse el onboarding antes de crear el usuario.";
    /*** REQUEST_UNBOARDING_RUC */
    public static final String  REQUEST_UNBOARDING_RUC = "Solicitud de onboarding para el RUC=";
    /*** PENDING_APPROVAL */
    public static final String  PENDING_APPROVAL = " está pendiente de aprobación. Estado(s): ";
    /*** NOT_PERMIT_OPERATION */
    public static final String  NOT_PERMIT_OPERATION =  "No se permiten operaciones sobre este cliente";
    /*** CLIENT_NOT_EXIST */
    public static final String  CLIENT_NOT_EXIST =  "ClientId no existe: ";
    /*** USER_CREATE_KEYCLOAK_FAIL */
    public static final String  USER_CREATE_KEYCLOAK_FAIL =  "Keycloak create admin user failed. HTTP=";
    /*** GROUP_CREATE_KEYCLOAK_FAIL */
    public static final String  GROUP_CREATE_KEYCLOAK_FAIL =  "Keycloak create group failed. HTTP=";
    /*** LOCATION */
    public static final String  LOCATION =  "Location";

    /*** COMPROBANTE_PATTERN */
    public static final Pattern COMPROBANTE_PATTERN = Pattern.compile("^(\\d{11})(?:-|\\.|$)");
    /*** ANULADOS_PATTERN */
    public static final Pattern ANULADOS_PATTERN = Pattern.compile("^[aA]-(\\d{11})(?:-|\\.|$)");
    /*** ADMIN_USER_ID_REQUIRED */
    public static final String  ADMIN_USER_ID_REQUIRED = "adminUserId is required";
    /*** PRODUCT_ID_REQUIRED */
    public static final String  PRODUCT_ID_REQUIRED = "productIds is required";
    /*** RUC_KEYCLOAK_NOT_REGISTER */
    public static final String  RUC_KEYCLOAK_NOT_REGISTER = "RUC not registered in Keycloak or missing id_customer";
    /*** USER_NOT_KEYCLOAK_FOUND */
    public static final String  USER_NOT_KEYCLOAK_FOUND = "No Keycloak user found for ruc=";
    /*** CUSTOMER_NOT_FOUND */
    public static final String  CUSTOMER_NOT_FOUND = "Customer not found for ruc=";
    /*** ROLE_REQUIRED */
    public static final String  ROLE_REQUIRED = "role required";
    /*** OPTION_ID_REQUIRED */
    public static final String  OPTION_ID_REQUIRED = "optionIds required";
    /*** REGEX_LOOK_UUID */
    public static final String  REGEX_LOOK_UUID = "^[0-9a-fA-F-]{36}$";
    /*** ROLE_NOT_FOUND */
    public static final String  ROLE_NOT_FOUND = "role not found in keycloak";
    /*** REALM_REQUIRED */
    public static final String  REALM_REQUIRED = "realm is required";
    /*** CLIENT_ID_REQUIRED */
    public static final String  CLIENT_ID_REQUIRED = "clientId required";
    /*** CUSTOMER_NOT_FOUND_ACTIVE */
    public static final String  CUSTOMER_NOT_FOUND_ACTIVE= "Customer not found/active";
    /*** MAC_IS_REQUIRED */
    public static final String  MAC_IS_REQUIRED= "MAC requerido";
    /*** ID_PACKAGE_IS_REQUIRED */
    public static final String  ID_PACKAGE_IS_REQUIRED= "id_package requerido";
    /*** FILE_RECIVED */
    public static final String  FILE_RECIVED= "El comprobante se ha procesado correctamente";
    /*** FILE_CANCELLED */
    public static final String  FILE_CANCELLED= "Archivo de anulados recibido. iniciado...";
    /*** COMMAND_NULL */
    public static final String  COMMAND_NULL= "Comando null";
    /*** USER_ID_IS_REQUIRED */
    public static final String  USER_ID_IS_REQUIRED= "userId is required";
    /*** ERROR_400 */
    public static final String  ERROR_400= "404";
    /*** ERROR_INVOKING */
    public static final String  ERROR_INVOKING= "Error invocando ";
    /*** STATUS_MSG */
    public static final String  STATUS_MSG= ". status=";
    /*** BODY_MSG */
    public static final String  BODY_MSG= ", body=";
    /*** RUC_COULD_NOT_BE_EXTRACTED */
    public static final String  RUC_COULD_NOT_BE_EXTRACTED = "No se pudo extraer RUC del archivo: ";
    /*** RESOURCE_ACCESS */
    public static final String  RESOURCE_ACCESS = "resource_access";
    /*** RESOURCE_ROLES */
    public static final String  RESOURCE_ROLES = "roles";
    /*** RESOURCE_ROLE_NAME */
    public static final String  RESOURCE_ROLE_NAME = "role_name";
    /*** PACKAGE_ID_COULD_NOT_BE_EXTRACTED */
    public static final String  PACKAGE_ID_COULD_NOT_BE_EXTRACTED = "No se pudo extraer el RUC desde id_package: ";
    /*** MAC_COULD_NOT_BE_EXTRACTED */
    public static final String  MAC_COULD_NOT_BE_EXTRACTED = "No se pudo extraer el RUC desde mac: ";
    /*** FOR_TYPE */
    public static final String  FOR_TYPE = " para tipo: ";
    /*** PREFERRED_USERNAME */
    public static final String  PREFERRED_USERNAME = "preferred_username";
    /*** PARAMETER_EMAIL */
    public static final String  PARAMETER_EMAIL = "email";
    /*** GIVEN_NAME */
    public static final String  GIVEN_NAME = "given_name";
    /*** FAMILY_NAME */
    public static final String  FAMILY_NAME = "family_name";
    /*** DB_WITH_CONNECTION_FAILED */
    public static final String  DB_WITH_CONNECTION_FAILED = "DB withConnection failed";
    /*** UPLOAD_FILE_CONSOLE_1 */
    public static final String  UPLOAD_FILE_CONSOLE_1 = "console1 subircomprobante";
    /*** UPLOAD_FILE_CONSOLE_2 */
    public static final String  UPLOAD_FILE_CONSOLE_2 = "console2 subircomprobante";
    /*** UPLOAD_FILE_ANU_CONSOLE_1 */
    public static final String  UPLOAD_FILE_ANU_CONSOLE_1 = "console1 subiranulados";
    /*** UPLOAD_FILE_ANU_CONSOLE_2 */
    public static final String  UPLOAD_FILE_ANU_CONSOLE_2 = "console2 subiranulados";
    /*** NOTIFY_CONSOLE_3 */
    public static final String  NOTIFY_CONSOLE_3 = "console3 notificaciones";
    /*** NOTIFY_CONSOLE_4 */
    public static final String  NOTIFY_CONSOLE_4 = "console4 notificaciones";
    /*** DELETE_NOTIFY_CONSOLE_3 */
    public static final String  DELETE_NOTIFY_CONSOLE_3 = "console3 deletenotifiaciones";
    /*** DELETE_NOTIFY_CONSOLE_4 */
    public static final String  DELETE_NOTIFY_CONSOLE_4 = "console4 deletenotifiaciones";
    /*** EMPTY_RESPONSE_REMOTE */
    public static final String  EMPTY_RESPONSE_REMOTE = "Respuesta vacía del servicio remoto";
    /*** MESSAJE_OK */
    public static final String  MESSAJE_OK = "mensaje";
    /*** CUSTOMER_MODEL_MUST_BE_PROVIDED */
    public static final String  CUSTOMER_MODEL_MUST_BE_PROVIDED = "Customer model must be provided";
    /*** CUSTOMER_ID_MUST_BE_PROVIDED */
    public static final String  CUSTOMER_ID_MUST_BE_PROVIDED = "Customer id must be provided";
    /*** CUSTOMER_NOT_FOUND_ID */
    public static final String  CUSTOMER_NOT_FOUND_ID = "Customer not found id=";
    /*** DOCUMENT_TYPE_NOT_FOUND */
    public static final String  DOCUMENT_TYPE_NOT_FOUND = "Document type not found";
    /*** ERROR_CONSULT_PORTAL */
    public static final String  ERROR_CONSULT_PORTAL = "Error consultando portal.proxy para ruc=";
    /*** ERROR_REGISTER_RUC_PROXY */
    public static final String  ERROR_REGISTER_RUC_PROXY = "Error registrando ruc en proxy.empresa ruc=";
    /*** NOT_COPY_FILE */
    public static final String  NOT_COPY_FILE = "No se pudo copiar archivo temporal";
    /*** PROXY_ANUL */
    public static final String  PROXY_ANUL = "proxy-anulados-";
    /*** PROXY_INI */
    public static final String  PROXY_INI = "proxy-";
    /*** REGEX_PATTERN */
    public static final String  REGEX_PATTERN = "^\\d+$";
    /*** CLIENT_ACTIVE */
    public static final String  CLIENT_ACTIVE = "Cliente activado correctamente";
    /*** CLIENT_DISABLED */
    public static final String  CLIENT_DISABLED = "Cliente desactivado correctamente";
    /*** NO_PRODUCT_ACTIVE */
    public static final String  NO_PRODUCT_ACTIVE = "No tiene productos activos";
    /*** PRODUCT_ACTIVE */
    public static final String  PRODUCT_ACTIVE = "Productos activos del cliente";
    /*** PERMISSIONS_ASSIGNED */
    public static final String  PERMISSIONS_ASSIGNED = "Permisos asignados correctamente";
    /*** CUSTOMER_PERMISSIONS_OBTAINED */
    public static final String  CUSTOMER_PERMISSIONS_OBTAINED = "Permisos del cliente obtenidos";
    /*** ROLES_KEYCLOAK_OBTAINED */
    public static final String  ROLES_KEYCLOAK_OBTAINED = "Roles obtenidos desde Keycloak";
    /*** NO_EXIST_CLIENTS */
    public static final String  NO_EXIST_CLIENTS = "No existen clientes";
    /*** LIST_CLIENTS */
    public static final String  LIST_CLIENTS = "Listado de clientes";
    /*** NOT_FOUND_USERS */
    public static final String  NOT_FOUND_USERS = "No se encontraron usuarios";
    /*** USERS_FILTERS_BY_RUC */
    public static final String  USERS_FILTERS_BY_RUC = "Usuarios filtrados por RUC";
    /*** LIST_USERS */
    public static final String  LIST_USERS = "Listado de usuarios";
    /*** ROLE_OPTIONS_SYNCHRONIZATION_COMPLETED */
    public static final String  ROLE_OPTIONS_SYNCHRONIZATION_COMPLETED = "Sincronización de roles y opciones completada";
    /*** USER_MIRROR_UPSERT_OK */
    public static final String  USER_MIRROR_UPSERT_OK = "User mirror upsert OK";
    /*** COMPROBANTE_ARCHIVO_NO_EXISTE */
    public static final String COMPROBANTE_ARCHIVO_NO_EXISTE = "17006";
    /*** COMPROBANTE_INPUTSTREAM_ERROR */
    public static final String COMPROBANTE_INPUTSTREAM_ERROR = "17007";
    /*** COMPROBANTE_ERROR_THROWABLE */
    public static final String COMPROBANTE_ERROR_THROWABLE = "17009";
    /*** ANULADOS_ARCHIVO_NO_EXISTE */
    public static final String ANULADOS_ARCHIVO_NO_EXISTE = "18006";
    /*** ANULADOS_NOMBRE_INVALIDO */
    public static final String ANULADOS_NOMBRE_INVALIDO = "18007";
    /*** RUC_INVALIDO */
    public static final String RUC_INVALIDO = "17010";
    /*** MAC_REQUERIDO */
    public static final String MAC_REQUERIDO = "17011";
    /*** ERROR_INTERNO */
    public static final String ERROR_INTERNO = "500";
    /*** MSG_ARCHIVO_NO_EXISTE */
    public static final String MSG_ARCHIVO_NO_EXISTE = "El archivo no existe";
    /*** MSG_MAC_REQUERIDO */
    public static final String MSG_MAC_REQUERIDO = "MAC requerido para subircomprobante";
    /*** MSG_NOMBRE_ANULADOS_INVALIDO */
    public static final String MSG_NOMBRE_ANULADOS_INVALIDO = "Nombre de archivo de anulados inválido. Debe iniciar con 'a-' y terminar en .yaml/.yml";

}
