package it.mediacontents.backoffice.suppliers.tools;

import it.mediacontents.backoffice.entities.SupplierTool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierToolRepository extends CrudRepository<SupplierTool, Long> {

    List<SupplierTool> findBySupplierId(Long supplierId);
}
Ø