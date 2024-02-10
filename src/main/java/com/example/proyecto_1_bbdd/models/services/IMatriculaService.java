package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface IMatriculaService {
    List<Matricula> findAll();
    Optional<Matricula> findById(int id);
    Matricula create(Matricula matricula);
    Matricula update(Matricula matricula);
    void delete(int id);
}
