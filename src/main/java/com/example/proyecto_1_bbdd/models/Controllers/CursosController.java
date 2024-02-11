package com.example.proyecto_1_bbdd.models.Controllers;

import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Cursos;
import com.example.proyecto_1_bbdd.models.entity.Extra;
import com.example.proyecto_1_bbdd.models.services.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CursosController {
    @Autowired
    private CursosService cursosService;

    @GetMapping("/cursos")
    public String getClases(Model model) {
        model.addAttribute("cursos", cursosService.findAll());
        model.addAttribute("extra", new Extra());
        return "cursos";
    }

    @GetMapping("/cursos/nueva")
    public String crearClases(Model model) {
        model.addAttribute("curso", new Cursos());
        return "crear-curso";
    }


    @PostMapping("/cursos/save")
    public String newMenu(Model model, @ModelAttribute("curso") Cursos cursos) {
        cursosService.create(cursos);
        return "redirect:/cursos";
    }

    @DeleteMapping("/cursos/delete")
    public String newMenu(Model model, @ModelAttribute("curso") Extra curso) {
        cursosService.delete(curso.getValue());
        return "redirect:/cursos";
    }
}