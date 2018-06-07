package com.solstice.contactsbackend.controllers.v1;

import com.solstice.contactsbackend.services.ContactService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class ContactControllerTest {

    @Mock
    ContactService contactService;

    ContactController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new ContactController(contactService);
    }

    @Test
    public void getAllContacts() {
    }

    @Test
    public void getContactByEmail() {
    }

    @Test
    public void getContactByWorkPhone() {
    }

    @Test
    public void getContactByPersonalPhone() {
    }

    @Test
    public void getContactsByState() {
    }

    @Test
    public void getContactsByCity() {
    }

    @Test
    public void addContact() {
    }

    @Test
    public void getContact() {
    }

    @Test
    public void updateContact() {
    }

    @Test
    public void deleteContact() {
    }
}