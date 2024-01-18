package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Cursos;

import java.util.List;

public interface CursosDao {
    void save(Cursos cursos);
    Cursos getCurso(int id);
    List<Cursos> getCursos();
    void deleteCurso(int id);
    void deleteAllCursos();
}
