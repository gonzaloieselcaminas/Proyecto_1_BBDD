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

    @ManyToMany
    @JoinTable(
            name = "Notas_Clases",
            joinColumns = @JoinColumn(name = "id_nota"),
            inverseJoinColumns = @JoinColumn(name = "id_clase")
    )
    private List<Clases> clases;

    @ManyToMany
    @JoinTable(
            name = "Notas_Estudiante",
            joinColumns = @JoinColumn(name = "id_nota"),
            inverseJoinColumns = @JoinColumn(name = "id_estudiante")
    )
    private List<Estudiante> estudiantes;

    public Notas(int nota, String descripcion) {
        this.nota = nota;
        this.descripcion = descripcion;
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

    public List<Clases> getClases() {
        return clases;
    }

    public void setClases(List<Clases> clases) {
        this.clases = clases;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
