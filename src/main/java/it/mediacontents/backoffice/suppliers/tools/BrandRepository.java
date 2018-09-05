package it.mediacontents.backoffice.suppliers.tools;

import it.mediacontents.backoffice.entities.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {

}
