package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class cursosController {
    @GetMapping("/curso")
    public String showHomeCurso() {
        return "cursoHome";
    }

    @GetMapping("/clasesCurso")
    public String showClases() {
        return "cursoClases";
    }

    @GetMapping("/matriculas")
    public String showMatriculas() {return "cursoMatriculas";}

    @GetMapping("/cursoConfig")
    public String showConfig() {return "cursosConfig";}
}
