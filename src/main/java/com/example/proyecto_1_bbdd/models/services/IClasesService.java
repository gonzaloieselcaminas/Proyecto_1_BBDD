package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Clases;

import java.util.List;
import java.util.Optional;

public interface IClasesService {
    List<Clases> findAll();
    Optional<Clases> findById(int id);
    Clases create(Clases clases);
    Clases update(Clases clases);
    void delete(int id);
}
