package it.mediacontents.backoffice.web.controller.api;

import it.mediacontents.backoffice.entities.Contact;
import it.mediacontents.backoffice.suppliers.contacts.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactsApiController {

    private ContactService contactService;

    public ContactsApiController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping(params = "supplierId")
    public ResponseEntity<List<Contact>> getSupplierBySupplierId(@RequestParam Long supplierId) {
        List<Contact> contacts = contactService.getContactsBySupplierId(supplierId);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

}
