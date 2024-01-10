package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Profesores")
public class Profesor {

    //@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "id_profesor")
    private List <Profesor> profesors;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int telefono, String nif, String email) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.nif = nif;
       this.email = email;
    }

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono", unique = true)
    private int telefono;
    @Column(name = "nif", unique = true)
    private String nif;
    @Column(name = "email", unique = true)
    private String email;

}