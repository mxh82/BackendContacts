package com.solstice.contactsbackend.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Contact contact;
    private String street;
    private String city;
    private String state;

}
