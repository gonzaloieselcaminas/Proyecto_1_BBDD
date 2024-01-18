package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Profesor;

import java.util.List;

public interface ProfesoresDao {
    public void safe(Profesor profesor);

    Profesor getProfesor (int id);

    List<Profesor> getAllProfesores();

    public void deleteProfe(int id);

    public  void deleteAllProfe();

    Profesor updateProfesor(Profesor profesor);


}
