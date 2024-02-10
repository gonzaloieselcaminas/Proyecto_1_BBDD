package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    List<Profesor> findAll();
    Optional<Profesor> findById(int id);
    Profesor create(Profesor profesor);
    Profesor update(Profesor profesor);
    void delete(int id);
}
