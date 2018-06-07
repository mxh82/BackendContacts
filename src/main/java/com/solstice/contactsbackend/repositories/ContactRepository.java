package com.solstice.contactsbackend.repositories;

import com.solstice.contactsbackend.domain.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    Optional<Contact> findByEmail(String email);
    Optional<Contact> findByWorkPhone(String workPhone);
    Optional<Contact> findByPersonalPhone(String personalPhone);
    List<Contact> findByAddress_City(String city);
    List<Contact> findByAddress_State(String state);
}
