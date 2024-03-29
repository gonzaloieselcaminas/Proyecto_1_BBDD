package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;


@Entity
@Table(name = "Horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private int id_horario;

    public Horario() {
    }

    public Horario(int id_clase, Time horaInicio, Time horaFinal, String fecha) {
        this.id_clase = id_clase;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.fecha = LocalDate.parse(fecha);
    }

    @Column(name = "id_clase", insertable=false, updatable=false)
    private int id_clase;

    @Column(name = "horaInicio")
    private Time horaInicio;
    @Column(name = "horaFinal")
    private Time horaFinal;
    @Column(name = "fecha")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id")
    private Clases clase;

    public int getId_horario() {
        return id_horario;
    }

    public int getId_clase() {
        return id_clase;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Clases getClase() {
        return clase;
    }

    public void setClase(Clases clase) {
        this.clase = clase;
    }

}