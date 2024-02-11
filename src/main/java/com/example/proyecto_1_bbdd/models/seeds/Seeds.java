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

        Estudiante e = new Estudiante("pabara", "gpirjgjgip", "pablo.fernandes@cor.com", "Pablo", "Fernandes", 632541078, "56321478Q", "2024-01-06");
        Estudiante e2 = new Estudiante("bersan", "password", "bernardo.santiago@cor.com", "Bernardo", "Santiago", 666777888, "12345678Q", "2024-02-26");
        Estudiante e3 = new Estudiante("esteban", "password2", "esteban.banco@cor.com", "Esteban", "Banco", 675675675, "87654321A", "2023-01-04");
        estudianteDAO.save(e);
        estudianteDAO.save(e2);
        estudianteDAO.save(e3);

        Profesor p = new Profesor("Manolo", "Otaco", 698547123  , "45789632E", "motaco@gmail.com");
        profesoresDao.save(p);

        Cursos c = new Cursos("DAM", "Curso de Desarrollo de Aplicaciones Multiplataforma", "2023-09-11", "2024-06-23", true);
        Cursos c2 = new Cursos("DAW", "Curso de Desarrollo de Aplicaciones Web", "2023-09-11", "2024-06-23", true);
        cursosDao.save(c);
        cursosDao.save(c2);
    }

}
