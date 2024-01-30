package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.Horario;

import java.util.List;

public interface HorariosDao {
    public void save(Horario horario);
    Horario getHorario(int id);
    List<Horario> getHorarios();
    void deleteHorario(int id);
    void deleteAllHorarios();
}
