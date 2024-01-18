package com.example.proyecto_1_bbdd.models.dao;


import com.example.proyecto_1_bbdd.models.entity.Notas;

import java.util.List;

public interface NotasDAO {
    void save(Notas notas);
    void deleteNota(int id);
    void deleteAllNotas();
}
