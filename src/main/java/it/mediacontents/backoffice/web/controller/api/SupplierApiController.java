package it.mediacontents.backoffice.web.controller.api;

import it.mediacontents.backoffice.entities.Supplier;
import it.mediacontents.backoffice.suppliers.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierApiController {

    private SupplierService supplierService;

    public SupplierApiController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        return new ResponseEntity<>(supplierService.getAllSuppliers(), HttpStatus.OK);
    }

    @GetMapping(params = "supplierId")
    public ResponseEntity<Supplier> getSupplierById(@RequestParam Long supplierId) {
        return new ResponseEntity<>(supplierService.getSupplierById(supplierId).orElse(new Supplier()), HttpStatus.OK);
    }

    @GetMapping(params = "username")
    public ResponseEntity<Supplier> getSupplierByUsername(@RequestParam String username) {
        return new ResponseEntity<>(supplierService.getSupplierByUsername(username).orElse(new Supplier()), HttpStatus.OK);
    }

}
