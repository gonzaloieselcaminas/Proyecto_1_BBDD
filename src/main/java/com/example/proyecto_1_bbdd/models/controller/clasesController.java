package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class clasesController {
    @GetMapping("/clase")
    public String showHomeClase() {
        return "claseInfo";
    }

    @GetMapping("/clasesConfig")
    public String showConfig() {return "clasesConfig";}
}
