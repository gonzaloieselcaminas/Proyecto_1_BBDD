package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "nota")
    private float nota;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToOne
    private Clases clase;

    @OneToOne
    private Estudiante estudiante;

    public Notas(int nota, String descripcion, Estudiante estudiante, Clases clase) {
        this.nota = nota;
        this.descripcion = descripcion;
        this.estudiante = estudiante;
        this.clase = clase;
    }

    public Notas() {

    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Clases getClase() {
        return clase;
    }

    public void setClase(Clases clase) {
        this.clase = clase;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
