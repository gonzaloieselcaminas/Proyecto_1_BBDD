package com.example.proyecto_1_bbdd.models.entity;

import jakarta.persistence.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.io.Serializable;

@Entity
@Table(name = "usersAdmin")
public class UsersAdmin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username", unique = true)
    private String nombre;

    @Column(name="name", unique = true)
    private String  name;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="password")
    private String password;

    public UsersAdmin() {

    }

    public UsersAdmin(String nombre, String name, String email, String password) {
        this.nombre = nombre;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
