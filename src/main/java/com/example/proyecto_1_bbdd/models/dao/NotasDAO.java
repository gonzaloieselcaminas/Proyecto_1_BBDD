package com.example.proyecto_1_bbdd.models.dao;


import com.example.proyecto_1_bbdd.models.entity.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotasDAO extends JpaRepository<Notas, Long> {

}
