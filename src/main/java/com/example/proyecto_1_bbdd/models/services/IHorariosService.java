package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.Horario;

import java.util.List;
import java.util.Optional;

public interface IHorariosService {
    List<Horario> findAll();
    Optional<Horario> findById(int id);
    Horario create(Horario horario);
    Horario update(Horario horario);
    void delete(int id);
}
