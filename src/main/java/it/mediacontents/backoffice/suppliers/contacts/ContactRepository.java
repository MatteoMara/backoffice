package it.mediacontents.backoffice.suppliers.contacts;

import it.mediacontents.backoffice.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

    List<Contact> findBySupplierId(Long supplierId);
}
