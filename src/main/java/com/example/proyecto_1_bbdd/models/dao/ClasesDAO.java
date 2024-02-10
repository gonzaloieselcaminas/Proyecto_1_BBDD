package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Clases;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClasesDAO extends JpaRepository<Clases, Long> {

}
