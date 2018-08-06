package us.deloitteinnovation.tieout.audit;

/**
 * Created by mnallathiga on 29-11-2016.
 * These are the event types used for Audit Logging
 */
public enum EventType {
    CREATE_CLIENT,
    MODIFY_CLIENT,
    DEACTIVATE_CLIENT,
    LEGAL_HOLD_CLIENT,
    CREATE_USER,
    MODIFY_USER,
    ASSOCIATE_CLIENT_USER,
    DEASSOCIATE_CLIENT_USER,
    DELETE_USER,
    CREATE_STATEMENT,
    UPLOAD_REVISION,
    DELETE_STATEMENT,
    PURGE_STATEMENT_REVISIONS,
    DELETE_STATEMENT_REVISION,
    SUBMIT_STATEMENT,
    APPROVE_STATEMENT,
    DECLINE_STATEMEMT,
    ADD_ELEMENT,
    INCLUDE_ELEMENT,
    EXCLUDE_ELEMENT,
    VERIFY_ELEMENT,
    FLAG_ELEMENT,
    CHANGE_SIGN,
    CHANGE_ENTITY,
    CHANGE_SCALING,
    CHANGE_UNITS,
    CHANGE_PERIOD,
    ADD_TAG,
    CHANGE_TAG,
    DELETE_TAG,
    ADD_WORKPAPER_REFERENCE,
    CHANGE_WORKPAPER_REFERENCE,
    DELETE_WORKPAPER_REFERENCE,
    ADD_REVIEW_NOTE,
    CHANGE_REVIEW_NOTE,
    CHANGE_REVIEW_NOTE_STATUS,
    DELETE_REVIEW_NOTE,
    ADD_CLIENT_NOTE,
    CHANGE_CLIENT_NOTE,
    CHANGE_CLIENT_NOTE_STATUS,
    DELETE_CLIENT_NOTE,
    ADD_TICKMARK,
    CHANGE_TICKMARK,
    DELETE_TICKMARK,
    DELETE_TICKMARK_FROM_DATABASE,
    ADD_FORMULA,
    CHANGE_FORMULA,
    DELETE_FORMULA,
    CHANGE_LABEL,
    BULK_UPDATE,
    EXCEL_REPORT,
    PDF_REPORT,
    ATTACH_TICKMARK_TO_ELEMENT,
    ATTACH_TICKMARK_TO_SECTION,
    DETACH_TICKMARK_FROM_ELEMENT,
    DETACH_TICKMARK_FROM_SECTION,
    MANUAL_ROLLOVER_OF_ELEMENTS,
    ADD_SECTION,
    REMOVE_SECTION
}