package com.example.proyecto_1_bbdd;

import com.example.proyecto_1_bbdd.models.dao.*;
import com.example.proyecto_1_bbdd.models.seeds.Seeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proyecto1BbddApplication {

    @Autowired
    UsersAdminDAO usersAdminDAO;

    @Autowired
    EstudianteDAO estudianteDAO;

    @Autowired
    ProfesoresDao profesoresDao;

    @Autowired
    CursosDao cursosDao;

    @Autowired
    MatriculaDao matriculaDao;

    @Autowired
    ClasesDAO clasesDAO;

    public static void main(String[] args) {
        SpringApplication.run(Proyecto1BbddApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Seeds seeds = new Seeds(usersAdminDAO, estudianteDAO, profesoresDao, cursosDao, matriculaDao, clasesDAO);
            seeds.generateSeeds();
        };
    }
}
