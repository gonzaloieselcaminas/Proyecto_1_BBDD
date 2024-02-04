package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class notasController {
    @GetMapping("/notas")
    public String showHomeNotas() {
        return "notasInfo";
    }

    @GetMapping("/notasConfig")
    public String showConfig() {return "notasConfig";}
}
