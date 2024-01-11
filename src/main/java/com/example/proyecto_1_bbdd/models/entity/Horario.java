package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "Horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private int id_horario;

    public Horario() {
    }

    public Horario(Clases id_clase, Time horaInicio, Time horaFinal, Date fecha) {
        this.id_clase = id_clase;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.fecha = fecha;
    }

    @Column(name = "horaInicio")
    private Time horaInicio;
    @Column(name = "horaFinal")
    private Time horaFinal;
    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id")
    private Clases id_clase;

    public int getId_horario() {
        return id_horario;
    }

    public Clases getId_clase() {
        return id_clase;
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

    public void setId_clase(Clases id_clase) {
        this.id_clase = id_clase;
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

}