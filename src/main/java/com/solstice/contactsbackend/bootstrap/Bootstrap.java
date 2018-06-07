package com.solstice.contactsbackend.bootstrap;

import com.solstice.contactsbackend.domain.Address;
import com.solstice.contactsbackend.domain.Contact;
import com.solstice.contactsbackend.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private ContactRepository contactRepository;

    // As of Spring 2.4 constructor based components are automatically wired.
    // No need for @Autowired annotation.
    public Bootstrap(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

   //Byte[] image = new Byte[100];
    private Byte[] image;
    //byte[] CDRIVES = hexStringToByteArray("e04fd020ea3a6910a2d808002b30309d");

    @Override
    public void run(String... args) throws Exception {

        Contact c1 = new Contact();
        Address a1 = new Address();
        c1.setName("Namon Smith");
        c1.setCompany("Acme");
        c1.setProfileimage(image);
        c1.setEmail("nams@fake.com");
        c1.setDob("01/12/1995");
        c1.setWorkPhone("3125550101");
        c1.setPersonalPhone("3125550102");

        a1.setStreet("1212 State");
        a1.setCity("Chicago");
        a1.setState("IL");
        //a1.setContact(c1);

        c1.setAddress(a1);

        Contact c2 = new Contact();
        Address a2 = new Address();
        c2.setName("Roddy Piper");
        c2.setCompany("WWF");
        c2.setProfileimage(image);
        c2.setEmail("roody@fake.com");
        c2.setDob("04/17/1954");
        c2.setWorkPhone("3125550201");
        c2.setPersonalPhone("3125550202");

        a2.setStreet("1020 LaSalle");
        a2.setCity("Los Angeles");
        a2.setState("CA");
        //a2.setContact(c2);

        c2.setAddress(a2);

        Contact c3 = new Contact();
        Address a3 = new Address();
        c3.setName("Josh Hampton");
        c3.setCompany("IBM");
        c3.setProfileimage(image);
        c3.setEmail("jhampton@fake.com");
        c3.setDob("05/23/1998");
        c3.setWorkPhone("3125550301");
        c3.setPersonalPhone("3125550302");

        a3.setStreet("102 Main");
        a3.setCity("Dayton");
        a3.setState("OH");
        //a3.setContact(c3);

        c3.setAddress(a3);

        Contact c4 = new Contact();
        Address a4 = new Address();
        c4.setName("Amy Lasso");
        c4.setCompany("Verizon");
        c4.setProfileimage(image);
        c4.setEmail("alasso@fake.com");
        c4.setDob("07/30/1988");
        c4.setWorkPhone("3125550401");
        c4.setPersonalPhone("3125550402");

        a4.setStreet("123 Howard");
        a4.setCity("Evanston");
        a4.setState("IL");
        //a4.setContact(c4);

        c4.setAddress(a4);

        Contact c5 = new Contact();
        Address a5 = new Address();
        c5.setName("Terry Hops");
        c5.setCompany("University of Chicago");
        c5.setProfileimage(image);
        c5.setEmail("thops@fake.com");
        c5.setDob("02/21/1985");
        c5.setWorkPhone("3125550501");
        c5.setPersonalPhone("3125550502");

        a5.setStreet("4327 S. Indiana");
        a5.setCity("Chicago");
        a5.setState("IL");
        //.setContact(c5);

        c5.setAddress(a5);

        contactRepository.save(c1);
        contactRepository.save(c2);
        contactRepository.save(c3);
        contactRepository.save(c4);
        contactRepository.save(c5);

        System.out.println("Data Loaded = " + contactRepository.count());
    }
}
