package com.solstice.contactsbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String company;

    @Lob // Creates a Blob
    private Byte[] profileimage;
    private String email;
    private String dob;
    private String workPhone;
    private String personalPhone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;



}
