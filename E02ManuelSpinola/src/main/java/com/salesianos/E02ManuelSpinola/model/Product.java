package com.salesianos.E02ManuelSpinola.model;

import javax.persistence.*;

@Entity(name = "Producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", nullable = false)
    String name;

    @Column(name = "precio", nullable = false)
    double price;

    @Column(name = "imagen")
    String image;

    @Column(name = "descripcion")
    String description;

}
