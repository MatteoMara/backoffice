package it.mediacontents.backoffice.suppliers;

import it.mediacontents.backoffice.entities.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    private SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        supplierRepository.findAll().forEach(suppliers::add);
        return suppliers;
    }

    public Optional<Supplier> getSupplierById(Long supplierId) {
        return supplierRepository.findById(supplierId);
    }

    public Optional<Supplier> getSupplierByUsername(String username) {
        return supplierRepository.findByUsername(username);
    }
}
