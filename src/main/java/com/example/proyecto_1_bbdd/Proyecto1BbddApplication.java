package com.example.proyecto_1_bbdd;

import com.example.proyecto_1_bbdd.models.dao.ClasesDAO;
import com.example.proyecto_1_bbdd.models.seeds.Seeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proyecto1BbddApplication {

    @Autowired
    ClasesDAO clasesDAO;

    public static void main(String[] args) {
        SpringApplication.run(Proyecto1BbddApplication.class, args);
    }

    @Bean
    void commandLineRunner(){
        Seeds seeds = new Seeds(clasesDAO);
        seeds.generateSeeds();
    }

}
