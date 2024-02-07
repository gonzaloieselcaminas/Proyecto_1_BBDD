package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class userAdminController {
    @GetMapping("/userAdmin")
    public String showHomeUserAdmin() {
        return "userAdminHome";
    }

    @GetMapping("/profesorConfig")
    public String showProfesorConfig() {return "profesorConfig";}

    @GetMapping("/estudianteConfig")
    public String showEstudianteConfig() {return "estudianteConfig";}
}
