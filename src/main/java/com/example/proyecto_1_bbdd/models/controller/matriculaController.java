package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class matriculaController {
    @GetMapping("/matricula")
    public String showHomeMatricula() {
        return "matriculaInfo";
    }

    @GetMapping("/matriculaConfig")
    public String showConfig() {return "matriculaConfig";}
}
