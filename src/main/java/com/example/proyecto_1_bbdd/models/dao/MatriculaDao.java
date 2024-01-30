package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Matricula;

import java.util.List;

public interface MatriculaDao {
    public void save(Matricula matricula);

    Matricula getMatricula(int id);

    List<Matricula> getAllMatriculas();

    public void deleteMatricula(int id);
    public void deleteAllMatriculas();

    Matricula updateMatricula(Matricula matricula);
}
