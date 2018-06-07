package com.solstice.contactsbackend.services;

import com.solstice.contactsbackend.domain.Contact;
import com.solstice.contactsbackend.repositories.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContacts() {
        log.debug("ContactService getAllContacts");
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll()
                .forEach(contacts::add);
        return contacts;
    }
    @Override
    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void updateContact(Long id, Contact contact) {
        log.debug("ContactService updateContact");
        contact.setId(id);
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public Contact getContact(Long id) {
        return contactRepository.findById(id).get();
    }

    @Override
    public Contact findByEmail(String email) {
        return contactRepository.findByEmail(email).get();
    }

    @Override
    public Contact findByWorkPhone(String workPhone) {
        return contactRepository.findByWorkPhone(workPhone).get();
    }

    @Override
    public Contact findByPersonalPhone(String personalPhone) {
        return contactRepository.findByPersonalPhone(personalPhone).get();
    }

    @Override
    public List<Contact> findByAddress_State(String state) {
        return contactRepository.findByAddress_State(state);
    }

    @Override
    public List<Contact> findByAddress_City(String city) {
        return contactRepository.findByAddress_City(city);
    }
}
