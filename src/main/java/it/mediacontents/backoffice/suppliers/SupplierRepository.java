package it.mediacontents.backoffice.suppliers;

import it.mediacontents.backoffice.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long> {

    Optional<Supplier> findByUsername(String username);

}
