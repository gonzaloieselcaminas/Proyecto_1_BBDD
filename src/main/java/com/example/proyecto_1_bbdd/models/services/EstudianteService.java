package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.EstudianteDAO;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() {
        return this.estudianteDAO.findAll();
    }

    @Override
    public Optional<Estudiante> findById(int id) {
        return estudianteDAO.findById((long) id);
    }

    @Override
    public Estudiante create(Estudiante estudiante) {
        return estudianteDAO.save(estudiante);
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
        Estudiante currentEstudiante = estudianteDAO.findById((long) estudiante.getId()).get();
        currentEstudiante.setDni(estudiante.getDni());
        currentEstudiante.setNombre(estudiante.getNombre());
        currentEstudiante.setApellido(estudiante.getApellido());
        currentEstudiante.setEmail(estudiante.getEmail());
        currentEstudiante.setFecha_registro(estudiante.getFecha_registro());
        currentEstudiante.setNombre_usuario(estudiante.getNombre_usuario());
        currentEstudiante.setTelefono(estudiante.getTelefono());
        return estudianteDAO.save(currentEstudiante);
    }

    @Override
    public void delete(int id) {
        Optional<Estudiante> estudiante = estudianteDAO.findById((long) id);
        System.out.println(estudiante);
        estudianteDAO.deleteById((long) id);
    }
}
