package com.example.proyecto_1_bbdd.entity;

import jakarta.persistence.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.io.Serializable;

@Entity
@Table(name = "Clases")
public class Clases implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="id_profesor")
    private int id_profesor;

    @Column(name="id_curso")
    private int id_curso;

    @Column(name="id_horario")
    private int id_horario;

    @Column(name="nombre")
    private String nombre;

    @Column(name="color")
    private String color;

    public Clases() {

    }

    public Clases(int id, int id_profesor, int id_curso, int id_horario, String nombre, String color) {
        this.id = id;
        this.id_profesor = id_profesor;
        this.id_curso = id_curso;
        this.id_horario = id_horario;
        this.nombre = nombre;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

