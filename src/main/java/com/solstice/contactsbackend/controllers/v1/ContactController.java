package com.solstice.contactsbackend.controllers.v1;

import com.solstice.contactsbackend.domain.Contact;
import com.solstice.contactsbackend.services.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        log.debug("Controller getAllContacts");
        return contactService.getAllContacts();
    }

    @GetMapping("/contacts/email/{email}")
    public Contact getContactByEmail(@PathVariable String email) {
        return contactService.findByEmail(email);
    }

    @GetMapping("/contacts/workPhone/{workPhone}")
    public Contact getContactByWorkPhone(@PathVariable String workPhone) {
        return contactService.findByWorkPhone(workPhone);
    }

    @GetMapping("/contacts/personalPhone/{personalPhone}")
    public Contact getContactByPersonalPhone (@PathVariable String personalPhone) {
        return contactService.findByPersonalPhone (personalPhone);
    }

    @GetMapping("/contacts/state/{state}")
    public List<Contact> getContactsByState(@PathVariable String state) {
        return contactService.findByAddress_State(state);
    }

    @GetMapping("/contacts/city/{city}")
    public List<Contact> getContactsByCity(@PathVariable String city) {
        return contactService.findByAddress_City(city);
    }

    @PostMapping("/contacts")
    public void addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
    }

    @GetMapping("/contacts/{id}")
    public Contact getContact(@PathVariable Long id) {
        return contactService.getContact(id);
    }

    @PutMapping("/contacts/{id}")
    public void updateContact(@PathVariable Long id,@RequestBody Contact contact) {
        log.debug("Controller updateContact");
        contactService.updateContact(id, contact);
    }

    @DeleteMapping("/contacts/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
