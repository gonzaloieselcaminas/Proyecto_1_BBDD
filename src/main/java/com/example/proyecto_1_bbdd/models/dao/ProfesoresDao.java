package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfesoresDao extends JpaRepository<Profesor, Long> {

}
