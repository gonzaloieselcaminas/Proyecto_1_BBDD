package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private int id_profesor;

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

    @OneToMany(mappedBy = "id_profesor")
    private List<Clases> clases;

    public List<Clases> getClases() {
        return clases;
    }

    public void setClases(List<Clases> clases) {
        this.clases = clases;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}