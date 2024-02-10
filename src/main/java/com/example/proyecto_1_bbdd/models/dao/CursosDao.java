package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursosDao extends JpaRepository<Cursos, Long> {

}
