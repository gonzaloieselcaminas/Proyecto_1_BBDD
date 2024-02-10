package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.NotasDAO;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Notas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotasService implements INotasService {

    @Autowired
    private NotasDAO notasDAO;

    @Override
    public List<Notas> findAll() {
        return this.notasDAO.findAll();
    }

    @Override
    public Optional<Notas> findById(int id) {
        return notasDAO.findById((long) id);
    }

    @Override
    public Notas create(Notas notas) {
        return notasDAO.save(notas);
    }

    @Override
    public Notas update(Notas notas) {
        Notas currentNotas = notasDAO.findById((long) notas.getId()).get();
        currentNotas.setNota(notas.getNota());
        currentNotas.setClase(notas.getClase());
        currentNotas.setDescripcion(notas.getDescripcion());
        currentNotas.setEstudiante(notas.getEstudiante());
        return notasDAO.save(currentNotas);
    }

    @Override
    public void delete(int id) {
        Optional<Notas> notas = notasDAO.findById((long) id);
        System.out.println(notas);
        notasDAO.deleteById((long) id);
    }
}
