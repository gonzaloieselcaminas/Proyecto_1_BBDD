package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Cursos;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CursosDaoImpl implements CursosDao{

    private final JdbcTemplate jdbcTemplate;

    public CursosDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Cursos cursos) {

    }

    @Override
    public Cursos getCurso(int id) {
        return null;
    }

    @Override
    public List<Cursos> getCursos() {
        return null;
    }

    @Override
    public void deleteCurso(int id) {

    }

    @Override
    public void deleteAllCursos() {

    }
}
