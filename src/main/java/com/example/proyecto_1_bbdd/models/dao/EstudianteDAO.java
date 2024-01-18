package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Estudiante;
import com.example.proyecto_1_bbdd.models.entity.Notas;

import java.util.List;

public interface EstudianteDAO {
    void save(Estudiante Estudiante);
    Estudiante getEstudiante(int id);
    List<Estudiante> getEstudiantes();
    Estudiante getEstudianteNotificaciones(int id);
    List<Notas> getAllNotas(int id);
    void deleteEstudiante(int id);
    void deleteAllEstudiantes();

}
