package com.example.proyecto_1_bbdd.models.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class ControllerClass {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }


    @GetMapping("/showMyLoginPage")
    public String showLoginPage() {
        return "plain-login";
    }
    @GetMapping("/access-denied")
    public String showError() {
        return "not-authorized";
    }
}
