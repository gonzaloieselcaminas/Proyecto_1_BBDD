package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="Cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_course")
    private int id_course;

    public Cursos() {};

    public Cursos(String nombre, String descripcion, String fechaInicio, String fechaFinal, boolean habilitado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaFinal = LocalDate.parse(fechaFinal);
        this.fechaInicio = LocalDate.parse(fechaInicio);
        this.habilitado = habilitado;
    }

    @Column(name="nombre", unique = true)
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fechaInicio")
    private LocalDate fechaInicio;

    @Column(name="fechaFinal")
    private LocalDate fechaFinal;

    @Column(name="habilitado")
    private boolean habilitado;

    @ManyToMany(mappedBy = "cursos")
    private List<Clases> clases;

    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;

    public int getId_course() {
        return id_course;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<Clases> getClases() {
        return clases;
    }

    public void setClases(List<Clases> clases) {
        this.clases = clases;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

}
