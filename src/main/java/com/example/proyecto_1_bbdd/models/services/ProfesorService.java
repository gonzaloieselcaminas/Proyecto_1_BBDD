package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.ProfesoresDao;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService implements IProfesorService {

    @Autowired
    private ProfesoresDao profesoresDao;

    @Override
    public List<Profesor> findAll() {
        return this.profesoresDao.findAll();
    }

    @Override
    public Optional<Profesor> findById(int id) {
        return profesoresDao.findById((long) id);
    }

    @Override
    public Profesor create(Profesor profesor) {
        return profesoresDao.save(profesor);
    }

    @Override
    public Profesor update(Profesor profesor) {
        Profesor currentClases = profesoresDao.findById((long) profesor.getId_profesor()).get();
        currentClases.setNombre(profesor.getNombre());
        currentClases.setApellido(profesor.getApellido());
        currentClases.setNif(profesor.getNif());
        currentClases.setEmail(profesor.getEmail());
        currentClases.setTelefono(profesor.getTelefono());
        currentClases.setClases(profesor.getClases());
        return profesoresDao.save(currentClases);
    }

    @Override
    public void delete(int id) {
        Optional<Profesor> profesores = profesoresDao.findById((long) id);
        System.out.println(profesores);
        profesoresDao.deleteById((long) id);
    }
}
