package com.Juliyad.Supplier_Service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDto {
    private Long supplierID;
    private String name;
    private String contactEmail;
}
