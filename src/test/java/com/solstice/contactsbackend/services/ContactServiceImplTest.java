package com.solstice.contactsbackend.services;

import com.solstice.contactsbackend.domain.Contact;
import com.solstice.contactsbackend.repositories.ContactRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ContactServiceImplTest {

    Contact contact;

    @Mock
    ContactService contactService;

    ContactRepository contactRepository;



    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        //contactService = new ContactServiceImpl(contactRepository);

        contact = new Contact();
        contact.setId(5l);
        contact.setName("Mr. Test");
        contact.setCompany("Acme");
    }

    @Test
    public void getAllContacts() {

        ArrayList contactData = new ArrayList();
        contactData.add(contact);

        when(contactService.getAllContacts()).thenReturn(contactData);

        List<Contact> contacts = contactService.getAllContacts();

        assertEquals(contacts.size(), 1);

    }


    @Test
    public void getContact() {

        when(contactService.getContact(5l)).thenReturn(contact);

        Contact testContact = contactService.getContact(5l);

        assertEquals(contact.getId(), testContact.getId());
    }

    @Test
    public void findByEmail() {
    }

    @Test
    public void findByAddress_City() {
    }
}