package com.solstice.contactsbackend.services;

import com.solstice.contactsbackend.domain.Contact;

import java.util.List;


public interface ContactService {

    void addContact(Contact contact);
    void updateContact(Long id, Contact contact);
    void deleteContact(Long id);
    Contact getContact(Long id);
    Contact findByEmail(String email);
    Contact findByWorkPhone(String workPhone);
    Contact findByPersonalPhone(String personalPhone);
    List<Contact> findByAddress_State(String state);
    List<Contact> findByAddress_City(String city);
    List<Contact> getAllContacts();
}
