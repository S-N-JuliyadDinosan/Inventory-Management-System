package com.Juliyad.Supplier_Service.api.mapper;

import com.Juliyad.Supplier_Service.api.dto.SupplierDto;
import com.Juliyad.Supplier_Service.entity.Supplier;

public class SupplierMapper {

    public static SupplierDto mapToSupplierDto(Supplier supplier){
        return new SupplierDto(
                supplier.getSupplierId(),
                supplier.getName(),
                supplier.getContactEmail()
        );
    }

    public static Supplier mapToSupplier(SupplierDto supplierDto){
        return new Supplier(
                supplierDto.getSupplierID(),
                supplierDto.getName(),
                supplierDto.getContactEmail()
        );
    }

}
