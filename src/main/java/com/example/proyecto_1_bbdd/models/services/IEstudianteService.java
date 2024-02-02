package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Cursos;
import com.example.proyecto_1_bbdd.models.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {
    List<Estudiante> findAll();
    Optional<Estudiante> findById(int id);
    Estudiante create(Estudiante estudiante);
    Estudiante update(Estudiante estudiante);
    void delete(int id);
}
