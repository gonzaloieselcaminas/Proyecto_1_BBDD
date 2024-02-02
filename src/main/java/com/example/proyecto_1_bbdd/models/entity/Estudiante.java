package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre_usuario", unique = true)
    private String nombre_usuario;

    @Column(name="contrasenya")
    private String contrasenya;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;


    @Column(name="telefono", unique = true)
    private int telefono;

    @Column(name="dni")
    private String dni;

    @Column(name = "notificaciones_activadas", columnDefinition = "boolean default false")
    private boolean notificaciones_activadas;

    @Column(name="fecha_registro")
    private Date fecha_registro;

    @OneToMany(mappedBy = "id_alumno")
    private List<Matricula> matriculas;

    @ManyToMany(mappedBy = "estudiantes")
    private List<Notas> notas;


    public Estudiante() {

    }

    public Estudiante(String nombre_usuario, String contrasenya, String email, String nombre, String apellido, int telefono, boolean notificaciones_activadas ,String dni, Date fecha_registro) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenya = contrasenya;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.notificaciones_activadas = notificaciones_activadas;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public boolean getNotificaciones_activadas() {
        return notificaciones_activadas;
    }

    public void setNotificaciones_activadas(boolean notificaciones_activadas) {
        this.notificaciones_activadas = notificaciones_activadas;
    }


    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

}