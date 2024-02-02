package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Estudiante;
import com.example.proyecto_1_bbdd.models.entity.Notas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO{
    private EntityManager entityManager;

    @Autowired
    public EstudianteDAOImpl(EntityManager entityManager){entityManager = entityManager;}
    @Override
    public void save(Estudiante estudiante) {
        entityManager.persist(estudiante);
    }

    @Override
    public Estudiante getEstudiante(int id) {
        return entityManager.find(Estudiante.class, id);
    }

    @Override
    public List<Estudiante> getEstudiantes() {
        TypedQuery<Estudiante> theQuery = entityManager.createQuery("FROM Estudiante", Estudiante.class);
        return  theQuery.getResultList();
    }

    @Override
    public Estudiante getEstudianteNotificaciones(int id) {
        return null;
    }

    @Override
    public List<Notas> getAllNotas(int id) {
        // Obtener el estudiante con el ID proporcionado
        Estudiante estudiante = entityManager.find(Estudiante.class, id);

        // Verificar si el estudiante existe
        if (estudiante == null) {
            throw new EntityNotFoundException("Estudiante con ID " + id + " no encontrado");
        }

        // Obtener todas las notas asociadas al estudiante
        List<Notas> notas = estudiante.getNotas();

        return notas;
    }

    @Override
    public void deleteEstudiante(int id) {

    }

    @Override
    public void deleteAllEstudiantes() {

    }
}
