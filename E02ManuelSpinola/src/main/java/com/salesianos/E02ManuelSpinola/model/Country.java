package com.salesianos.E02ManuelSpinola.model;

import javax.persistence.*;

@Entity(name = "Pais")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, name = "nombre", length = 128)
    String name;

}
