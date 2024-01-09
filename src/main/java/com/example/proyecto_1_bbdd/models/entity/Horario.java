package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


@Entity
@Table(name = "Horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private int id_horario;

    public Horario() {
    }

    public Horario(List<Clases> clases, Time horaInicio, Time horaFinal, Date fecha) {
        this.clases = clases;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.fecha = fecha;
    }

    @OneToMany
    @JoinColumn(name = "id_clase")
    private List<Clases> clases;

    @Column(name = "horaInicio")
    private Time horaInicio;
    @Column(name = "horaFinal")
    private Time horaFinal;
    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id")
    private Clases clase;

    public int getId_horario() {
        return id_horario;
    }

    public List<Clases> getClases() {
        return clases;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public void setClases(List<Clases> clase) {
        this.clases = clases;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Clases getClase() {
        return clase;
    }

    public void setClase(Clases clase) {
        this.clase = clase;
    }

}