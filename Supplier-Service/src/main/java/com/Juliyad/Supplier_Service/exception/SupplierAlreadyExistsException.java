package com.Juliyad.Supplier_Service.exception;

public class SupplierAlreadyExistsException extends RuntimeException{

    public SupplierAlreadyExistsException(String message){
        super(message);
    }
}
