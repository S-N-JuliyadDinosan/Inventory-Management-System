package com.Juliyad.Supplier_Service.service.impl;

import com.Juliyad.Supplier_Service.api.dto.SupplierDto;
import com.Juliyad.Supplier_Service.api.mapper.SupplierMapper;
import com.Juliyad.Supplier_Service.entity.Supplier;
import com.Juliyad.Supplier_Service.exception.SupplierAlreadyExistsException;
import com.Juliyad.Supplier_Service.repository.SupplierRepository;
import com.Juliyad.Supplier_Service.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public SupplierDto createSupplier(SupplierDto supplierDto) {
        Optional<Supplier> supplier = supplierRepository.findByContactEmail(supplierDto.getContactEmail());
        if (supplier.isEmpty()){
           Supplier newSupplier = SupplierMapper.mapToSupplier(supplierDto);
           supplierRepository.save(newSupplier);
           return SupplierMapper.mapToSupplierDto(newSupplier);
        }
        else {
            throw new SupplierAlreadyExistsException("The supplier with the email of " + supplierDto.getContactEmail() + " already exists");
        }
    }
}
