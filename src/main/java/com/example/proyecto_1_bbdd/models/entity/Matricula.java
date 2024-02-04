package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private int id_matricula;

    public Matricula() {}

    public Matricula(Cursos curso, Estudiante estudiante, boolean status) {
        this.curso = curso;
        this.estudiante = estudiante;
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Cursos curso;

    @OneToOne
    @JoinColumn(name = "id_alumno")
    private Estudiante estudiante;
    @Column(name = "status")
    private boolean status;

    public int getId_matricula() {
        return id_matricula;
    }

    public Cursos getCurso() {
        return curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public void setId_curso(Cursos id_curso) {
        this.curso = curso;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}