package com.example.proyecto_1_bbdd.models.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class loginController {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }


    @GetMapping("/showMyLoginPage")
    public String showLoginPage() {
        return "plain-login";
    }
}
