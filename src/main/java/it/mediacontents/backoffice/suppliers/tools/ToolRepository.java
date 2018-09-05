package it.mediacontents.backoffice.suppliers.tools;

import it.mediacontents.backoffice.entities.Brand;
import it.mediacontents.backoffice.entities.Tool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToolRepository extends CrudRepository<Tool, Long> {

    List<Tool> findByBrand(Brand brand);
}
