package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.ClasesDAO;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.awt.SystemColor.menu;

@Service
public class ClasesService implements IClasesService{

    @Autowired
    private ClasesDAO clasesDAO;

    @Override
    public List<Clases> findAll() {
        return this.clasesDAO.findAll();
    }

    @Override
    public Optional<Clases> findById(int id) {
        return clasesDAO.findById((long) id);
    }

    @Override
    public Clases create(Clases clases) {
        return clasesDAO.save(clases);
    }

    @Override
    public Clases update(Clases clases) {
        Clases currentClases = clasesDAO.findById((long) clases.getId()).get();
        currentClases.setId_profesor(clases.getId_profesor());
        currentClases.setNombre(clases.getNombre());
        currentClases.setColor(clases.getColor());
        return clasesDAO.save(currentClases);
    }

    @Override
    public void delete(int id) {
        Optional<Clases> clases = clasesDAO.findById((long) id);
        System.out.println(clases);
        clasesDAO.deleteById((long) id);
    }
}
