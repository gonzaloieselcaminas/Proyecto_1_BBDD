package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Cursos;

import java.util.List;
import java.util.Optional;

public interface ICursosService {
    List<Cursos> findAll();
    Optional<Cursos> findById(int id);
    Cursos create(Cursos cursos);
    Cursos update(Cursos cursos);
    void delete(int id);
}
