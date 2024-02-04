package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Clases")
public class Clases implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor", insertable = false, updatable = false)
    private Profesor id_profesor;

    @ManyToMany
    @JoinTable(
            name = "Cursos_Clases",
            joinColumns = @JoinColumn(name = "id_clase"),
            inverseJoinColumns = @JoinColumn(name = "id_course")
    )
    private List<Cursos> cursos;

    @OneToMany(mappedBy = "id_horario")
    private List<Horario> horarios;

    @Column(name="nombre")
    private String nombre;

    @Column(name="color")
    private String color;

    @ManyToMany(mappedBy = "clases")
    private List<Notas> notas;

    public Clases() {

    }

    public Clases(int id, Profesor id_profesor, List<Cursos> cursos, List<Horario> id_horario, String nombre, String color) {
        this.id = id;
        this.id_profesor = id_profesor;
        this.cursos = cursos;
        this.horarios = id_horario;
        this.nombre = nombre;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesor getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Profesor id_profesor) {
        this.id_profesor = id_profesor;
    }

    public List<Cursos> getId_curso() {
        return cursos;
    }

    public void setId_curso(List<Cursos> id_curso) {
        this.cursos = id_curso;
    }

    public List<Horario> getId_horario() {
        return horarios;
    }

    public void setId_horario(List<Horario> horarios) {
        this.horarios = horarios;
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

    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }
}

