package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Clases;

import java.util.List;

public interface ClasesDAO {
    void save(Clases clases);
     Clases getClase (int id);

     List<Clases> getAllClases();
}
