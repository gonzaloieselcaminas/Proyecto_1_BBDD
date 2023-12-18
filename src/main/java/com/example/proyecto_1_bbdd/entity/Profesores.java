package com.example.proyecto_1_bbdd.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Profesores")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private int id_profesor;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, int telefono, String nif, String email) {
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