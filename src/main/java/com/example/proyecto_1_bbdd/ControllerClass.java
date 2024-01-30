package com.example.proyecto_1_bbdd;

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
}
