package com.example.proyecto_1_bbdd.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private int id_matricula;

    public Matricula() {}

    public Matricula(int id_curso, int id_alumno, boolean status) {
        this.id_curso = id_curso;
        this.id_alumno = id_alumno;
        this.status = status;
    }

    @Column(name = "id_curso", unique = true)
    private int id_curso;

    @Column(name = "id_alumno")
    private int id_alumno;
    @Column(name = "status")
    private boolean status;

    public int getId_matricula() {
        return id_matricula;
    }

    public int getId_curso() {
        return id_curso;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}