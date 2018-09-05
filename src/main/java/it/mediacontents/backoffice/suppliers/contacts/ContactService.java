package it.mediacontents.backoffice.suppliers.contacts;

import it.mediacontents.backoffice.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Optional<Contact> getContactById(Long contactId) {
        return contactRepository.findById(contactId);
    }

    public List<Contact> getContactsBySupplierId(Long supplierId) {
        return contactRepository.findBySupplierId(supplierId);
    }

    public Contact saveContact(Contact newContact) {
        return contactRepository.save(newContact);
    }

    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }

    public void deleteContact(Long contactId) {
        contactRepository.deleteById(contactId);
    }

}
