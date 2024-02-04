package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class horarioController {
    @GetMapping("/horario")
    public String showHomeHorario() {
        return "horarioInfo";
    }

    @GetMapping("/horarioConfig")
    public String showConfig() {return "horarioConfig";}
}
