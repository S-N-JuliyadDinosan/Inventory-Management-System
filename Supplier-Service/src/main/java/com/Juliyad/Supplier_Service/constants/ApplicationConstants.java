package com.Juliyad.Supplier_Service.constants;

public interface ApplicationConstants {

    public static final String BAD_REQUEST = "Bad request";
    public static final String INTERNAL_SERVER_ERROR = "Internal server error";
    public static final String UNAUTHORIZED_ACCESS = "Unauthorized access";
    public static final String FORBIDDEN_OPERATION = "You do not have permission to perform this operation";

    // Supplier Messages
    public static final String SUPPLIER_NOT_FOUND = "Supplier not found";
    public static final String SUPPLIER_ALREADY_EXISTS = "Supplier already exists with given identifier";
    public static final String SUPPLIER_CREATED_SUCCESSFULLY = "Supplier created successfully";
    public static final String SUPPLIER_UPDATED_SUCCESSFULLY = "Supplier updated successfully";
    public static final String SUPPLIER_DELETED_SUCCESSFULLY = "Supplier deleted successfully";
    public static final String SUPPLIER_INACTIVE = "Supplier is currently inactive";

    // Validation
    public static final String SUPPLIER_NAME_TAKEN = "Supplier name is already taken";
    public static final String INVALID_SUPPLIER_DETAILS = "Invalid supplier details provided";
    public static final String MISSING_REQUIRED_FIELDS = "Missing required fields";

    // Status Constants
    public static final String ACTIVE = "Active";
    public static final String INACTIVE = "Inactive";
    public static final String PENDING = "Pending";
    public static final String SUSPENDED = "Suspended";

    // Entity Names
    public static final String SUPPLIER = "supplier";
    public static final String SUPPLIER_CONTACT = "supplier contact";
}