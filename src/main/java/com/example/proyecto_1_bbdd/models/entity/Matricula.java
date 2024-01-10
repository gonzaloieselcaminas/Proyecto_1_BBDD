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

    public Matricula(Cursos curso, Estudiante id_alumno, boolean status) {
        this.curso = curso;
        this.id_alumno = id_alumno;
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "id_alumno", referencedColumnName = "id")
    private Estudiante id_alumno;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Cursos curso;
    @Column(name = "status")
    private boolean status;

    public int getId_matricula() {
        return id_matricula;
    }

    public Cursos getCursos() {
        return curso;
    }

    public Estudiante getId_alumno() {
        return id_alumno;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public void setCursos(Cursos curso) {
        this.curso = curso;
    }

    public void setId_alumno(Estudiante id_alumno) {
        this.id_alumno = id_alumno;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}