package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class profesorController {
    @GetMapping("/profesor")
    public String showHomeProfesor() {
        return "profesorHome";
    }

    @GetMapping("/myEstudiantes")
    public String showMyEstudiantes() {
        return "profesorEstudiantes";
    }

    @GetMapping("/myClases")
    public String showMyClases() {return "profesorClases";}

    @GetMapping ("/myHorario")
    public String showMyHorario(){return "profesorHorario";}

    @GetMapping("/profesorConfig")
    public String showConfig() {return "profesorConfig";}
}
