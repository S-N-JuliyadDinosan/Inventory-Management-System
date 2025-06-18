package com.Juliyad.User_Management_Service.constants;

public interface ApplicationConstants {

    public static final String BAD_REQUEST = "Bad request";
    public static final String INTERNAL_SERVER_ERROR = "Internal server error";
    public static final String UNAUTHORIZED_ACCESS = "Unauthorized access";
    public static final String FORBIDDEN_OPERATION = "You do not have permission to perform this operation";

    // User Messages
    public static final String USER_NOT_FOUND = "User not found";
    public static final String USER_ALREADY_EXISTS = "User already exists with given NIC number";
    public static final String USER_CREATED_SUCCESSFULLY = "User created successfully";
    public static final String USER_UPDATED_SUCCESSFULLY = "User updated successfully";
    public static final String USER_DELETED_SUCCESSFULLY = "User deleted successfully";
    public static final String USER_ROLE_INVALID = "Provided user role is invalid";

    // Role Messages
    public static final String ROLE_NOT_FOUND = "Role not found";
    public static final String ROLE_ALREADY_EXISTS = "Role already exists";
    public static final String ROLE_ASSIGNED_SUCCESSFULLY = "Role assigned successfully to user";
    public static final String ROLE_REMOVED_SUCCESSFULLY = "Role removed from user";

    // Authentication / Security
    public static final String INVALID_CREDENTIALS = "Invalid username or password";
    public static final String ACCOUNT_LOCKED = "Account is locked. Please contact administrator.";
    public static final String PASSWORD_UPDATED_SUCCESSFULLY = "Password updated successfully";
    public static final String TOKEN_EXPIRED = "Authentication token has expired";

    // Validation
    public static final String EMAIL_ALREADY_REGISTERED = "Email address is already registered";
    public static final String USERNAME_TAKEN = "Username is already taken";
    public static final String MISSING_REQUIRED_FIELDS = "Missing required fields";

    // Status Constants
    public static final String ACTIVE = "Active";
    public static final String INACTIVE = "Inactive";
    public static final String PENDING = "Pending";
    public static final String DEACTIVATED = "Deactivated";

    // Entity Names
    public static final String USER = "user";
    public static final String ROLE = "role";
    public static final String PERMISSION = "permission";

}
