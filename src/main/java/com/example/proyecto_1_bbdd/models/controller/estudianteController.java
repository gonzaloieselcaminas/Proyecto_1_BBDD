package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class estudianteController {
    @GetMapping("/estudiante")
    public String showHomeEstudiante() {
        return "estudianteHome";
    }

    @GetMapping("/myNotas")
    public String showMyNotas() {
        return "estudianteNotas";
    }

    @GetMapping("/myNotificaciones")
    public String showMyNotificaciones() {return "estudianteNotificaciones";}

    @GetMapping ("/myHorario")
    public String showMyHorario(){return "estudianteHorario";}

    @GetMapping("/estudianteConfig")
    public String showConfig() {return "estudianteConfig";}



}
