package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.HorariosDao;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Horario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorariosService implements IHorariosService {

    @Autowired
    private HorariosDao horariosDao;

    @Override
    public List<Horario> findAll() {
        return this.horariosDao.findAll();
    }

    @Override
    public Optional<Horario> findById(int id) {
        return horariosDao.findById((long) id);
    }

    @Override
    public Horario create(Horario horario) {
        return horariosDao.save(horario);
    }

    @Override
    public Horario update(Horario horario) {
        Horario currentHorario = horariosDao.findById((long) horario.getId_horario()).get();
        currentHorario.setClase(horario.getClase());
        currentHorario.setFecha(horario.getFecha());
        currentHorario.setHoraInicio(horario.getHoraInicio());
        currentHorario.setHoraFinal(horario.getHoraFinal());
        return horariosDao.save(currentHorario);
    }

    @Override
    public void delete(int id) {
        Optional<Horario> horario = horariosDao.findById((long) id);
        System.out.println(horario);
        horariosDao.deleteById((long) id);
    }
}
