package com.solstice.contactsbackend.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    Contact contact;

    @Before
    public void setUp() {
        contact = new Contact();
    }

    @Test
    public void getId() {
        Long idValue = 4l;
        contact.setId(idValue);
        assertEquals(idValue, contact.getId());
    }

    @Test
    public void getName() {
        String testName = "Mike Hammer";
        contact.setName(testName);
        assertEquals(testName, contact.getName());
    }

    @Test
    public void getCompany() {
        String testComp = "Mixolgy";
        contact.setCompany(testComp);
        assertEquals(testComp, contact.getCompany());
    }

    @Test
    public void getEmail() {
        String testEmail = "test@junit.com";
        contact.setEmail(testEmail);
        assertEquals(testEmail, contact.getEmail());
    }

    @Test
    public void getDob() {
        String testDob = "01/01/1969";
        contact.setDob(testDob);
        assertEquals(testDob, contact.getDob());
    }

    @Test
    public void getWorkPhone() {
        String testWkPhone = "3125550001";
        contact.setWorkPhone(testWkPhone);
        assertEquals(testWkPhone, contact.getWorkPhone());
    }

    @Test
    public void getPersonalPhone() {
        String testPPhone = "3125558000";
        contact.setPersonalPhone(testPPhone);
        assertEquals(testPPhone, contact.getPersonalPhone());
    }

    @Test
    public void getAddress() {
        Address add = new Address();
        add.setState("MN");
        add.setCity("StPaul");
        add.setStreet("9874 Jump Street");

        contact.setAddress(add);
        assertEquals(add, contact.getAddress());
    }
}