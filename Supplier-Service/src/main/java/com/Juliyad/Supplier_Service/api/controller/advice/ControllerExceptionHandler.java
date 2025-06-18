package com.Juliyad.Supplier_Service.api.controller.advice;

import com.Juliyad.Supplier_Service.constants.ApplicationConstants;
import com.Juliyad.Supplier_Service.exception.SupplierAlreadyExistsException;
import com.Juliyad.Supplier_Service.util.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(SupplierAlreadyExistsException.class)
    public ResponseEntity<ErrorMessages> handleUserAlreadyExistsException(SupplierAlreadyExistsException ex){
        ErrorMessages errorMessages = new ErrorMessages(
                ex.getMessage(),
                ApplicationConstants.SUPPLIER_ALREADY_EXISTS,
                HttpStatus.CONFLICT.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessages, HttpStatus.CONFLICT);
    }
}
