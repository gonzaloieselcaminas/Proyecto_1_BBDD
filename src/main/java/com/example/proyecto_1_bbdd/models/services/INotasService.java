package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Notas;

import java.util.List;
import java.util.Optional;

public interface INotasService {
    List<Notas> findAll();
    Optional<Notas> findById(int id);
    Notas create(Notas notas);
    Notas update(Notas notas);
    void delete(int id);
}
