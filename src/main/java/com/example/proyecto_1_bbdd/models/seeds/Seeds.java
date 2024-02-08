package com.example.proyecto_1_bbdd.models.seeds;

import com.example.proyecto_1_bbdd.models.dao.*;
import com.example.proyecto_1_bbdd.models.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Seeds {
    private UsersAdminDAO usersAdminDAO;
    private EstudianteDAO estudianteDAO;
    private ProfesoresDao profesoresDao;
    private CursosDao cursosDao;
    private MatriculaDao matriculaDao;
    private ClasesDAO clasesDAO;

    public Seeds(UsersAdminDAO usersAdminDAO, EstudianteDAO estudianteDAO, ProfesoresDao profesoresDao, CursosDao cursosDao,
                MatriculaDao matriculaDao, ClasesDAO clasesDAO) {
        this.usersAdminDAO = usersAdminDAO;
        this.estudianteDAO = estudianteDAO;
        this.profesoresDao = profesoresDao;
        this.cursosDao = cursosDao;
        this.matriculaDao = matriculaDao;
        this.clasesDAO = clasesDAO;
    }

    public void generateSeeds() {
        UsersAdmin ua = new UsersAdmin("Juan", "JuanitoGamer", "juan@gmail.com", "17236548");
        usersAdminDAO.save(ua);

        Estudiante e = new Estudiante("pabara", "gpirjgjgip", "pablo.fernandes@gmail.com", "Pablo", "Fernandes", 632541078, "56321478Q", "2024-01-06");
        estudianteDAO.save(e);

        Profesor p = new Profesor("Manolo", "Otaco", 698547123  , "45789632E", "motaco@gmail.com");
        profesoresDao.save(p);

        Cursos c = new Cursos("DAM", "Curso de Desarrollo de Aplicaciones Multiplataforma", "2023-09-11", "2024-06-23", true);
        cursosDao.save(c);

        Matricula m = new Matricula(c, e, true);
        matriculaDao.save(m);

        List<Cursos> cursos = new ArrayList<>();
        cursos.add(c);

        Clases cl = new Clases(p, cursos, "1º DE DAM L", "Rojo");
        clasesDAO.save(cl);

    }

}
