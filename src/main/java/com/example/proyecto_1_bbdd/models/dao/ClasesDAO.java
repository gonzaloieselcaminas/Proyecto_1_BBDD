package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Notas;

import java.util.List;

public interface ClasesDAO {
    void save(Clases clases);
    Clases getClase(int id);
    List<Clases> getClases();
    List<Notas> getAllNotas(int id);
    void deleteClase(int id);
    void deleteAllClases();
}
