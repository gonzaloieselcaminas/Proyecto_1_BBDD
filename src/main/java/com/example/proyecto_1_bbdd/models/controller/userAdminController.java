package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class userAdminController {
    @GetMapping("/userAdmin")
    public String showHomeUserAdmin() {
        return "userAdminHome";
    }
}
