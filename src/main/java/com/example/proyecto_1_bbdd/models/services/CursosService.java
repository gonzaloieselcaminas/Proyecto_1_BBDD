package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.CursosDao;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Cursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursosService implements ICursosService {

    @Autowired
    private CursosDao cursosDao;

    @Override
    public List<Cursos> findAll() {
        return this.cursosDao.findAll();
    }

    @Override
    public Optional<Cursos> findById(int id) {
        return cursosDao.findById((long) id);
    }

    @Override
    public Cursos create(Cursos cursos) {
        return cursosDao.save(cursos);
    }

    @Override
    public Cursos update(Cursos cursos) {
        Cursos currentCurso = cursosDao.findById((long) cursos.getId_course()).get();
        currentCurso.setId_course(cursos.getId_course());
        currentCurso.setNombre(cursos.getNombre());
        currentCurso.setDescripcion(cursos.getDescripcion());
        currentCurso.setHabilitado(cursos.isHabilitado());
        currentCurso.setFechaInicio(cursos.getFechaInicio());
        currentCurso.setFechaFinal(cursos.getFechaFinal());
        return cursosDao.save(currentCurso);
    }

    @Override
    public void delete(int id) {
        Optional<Cursos> cursos = cursosDao.findById((long) id);
        System.out.println(cursos);
        cursosDao.deleteById((long) id);
    }
}
