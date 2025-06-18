package com.Juliyad.User_Management_Service.api.controller.Advice;

import com.Juliyad.User_Management_Service.constants.ApplicationConstants;
import com.Juliyad.User_Management_Service.exception.ResourceNotFoundException;
import com.Juliyad.User_Management_Service.exception.UserAlreadyExistsException;
import com.Juliyad.User_Management_Service.exception.UserNotFoundException;
import com.Juliyad.User_Management_Service.util.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorMessages> handleUserAlreadyExistsException(UserAlreadyExistsException ex){
        ErrorMessages errorMessages = new ErrorMessages(
                ex.getMessage(),
                ApplicationConstants.USER_ALREADY_EXISTS,
                HttpStatus.CONFLICT.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessages, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorMessages> handleResourceNotFoundException(ResourceNotFoundException ex){
        ErrorMessages errorMessages = new ErrorMessages(
                ex.getMessage(),
                "RESOURCE_NOT_FOUND",
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessages, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorMessages> handleUserNotFoundException(UserNotFoundException ex){
        ErrorMessages errorMessages = new ErrorMessages(
                ex.getMessage(),
                ApplicationConstants.USER_NOT_FOUND,
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessages, HttpStatus.NOT_FOUND);
    }
}
