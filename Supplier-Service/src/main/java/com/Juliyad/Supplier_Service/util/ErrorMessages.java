package com.Juliyad.Supplier_Service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ErrorMessages {
    private String message;
    private String error;
    private int status;
    private LocalDateTime timestamp;
}
