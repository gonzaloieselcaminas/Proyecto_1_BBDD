package com.example.proyecto_1_bbdd.models.services;


import com.example.proyecto_1_bbdd.models.dao.MatriculaDao;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaDao matriculaDao;

    @Override
    public List<Matricula> findAll() {
        return this.matriculaDao.findAll();
    }

    @Override
    public Optional<Matricula> findById(int id) {
        return matriculaDao.findById((long) id);
    }

    @Override
    public Matricula create(Matricula matricula) {
        return matriculaDao.save(matricula);
    }

    @Override
    public Matricula update(Matricula matricula) {
        Matricula currentMatricula = matriculaDao.findById((long) matricula.getId_matricula()).get();
        currentMatricula.setEstudiante(matricula.getEstudiante());
        currentMatricula.setId_curso(matricula.getCurso());
        currentMatricula.setStatus(matricula.getStatus());
        return matriculaDao.save(currentMatricula);
    }

    @Override
    public void delete(int id) {
        Optional<Matricula> matricula = matriculaDao.findById((long) id);
        System.out.println(matricula);
        matriculaDao.deleteById((long) id);
    }
}
