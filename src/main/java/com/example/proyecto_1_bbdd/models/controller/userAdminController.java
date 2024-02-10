package com.example.proyecto_1_bbdd.models.controller;

import com.example.proyecto_1_bbdd.models.entity.Estudiante;
import com.example.proyecto_1_bbdd.models.entity.Profesor;
import com.example.proyecto_1_bbdd.models.services.EstudianteService;
import com.example.proyecto_1_bbdd.models.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class userAdminController {

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/userAdmin")
    public String showHomeUserAdmin() {
        return "userAdminHome";
    }


    @GetMapping("/userAdmin/estudiante/create")
    public String createEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("currentPage", "estudiante");
        return "create_estudiante";
    }

    @PostMapping("/userAdmin/estudiante/save")
    public String saveEstudiante(Model model, @ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteService.create(estudiante);
        return "redirect:/userAdmin";
    }
    @GetMapping("/userAdmin/profesor/create")
    public String createProfesor(Model model) {
        model.addAttribute("profesor", new Profesor());
        model.addAttribute("currentPage", "profesor");
        return "create_profesor";
    }

    @PostMapping("/userAdmin/profesor/save")
    public String saveProfesor(Model model, @ModelAttribute("profesor") Profesor profesor) {
        profesorService.create(profesor);
        return "redirect:/userAdmin";
    }

    @PostMapping("/userAdmin/estudiante/update/{id}")
    public String updateEstudiante(@PathVariable("id") int id,
                             @ModelAttribute("estudiante") Estudiante estudianteDetails) throws Exception {
        Optional<Estudiante> estudiante = Optional.ofNullable(estudianteService.findById(id).orElseThrow(() -> new Exception("Estudiante" + id + " not found")));
        if(estudiante.isPresent()){
            estudiante.get().setNombre(estudianteDetails.getNombre());
            estudiante.get().setApellido(estudianteDetails.getApellido());
            estudianteService.update(estudiante.get());
        }
        return "redirect:/userAdmin";
    }

    @PostMapping("/userAdmin/profesor/update/{id}")
    public String updateProfesor(@PathVariable("id") int id,
                             @ModelAttribute("profesor") Profesor profesorDetails) throws Exception {
        Optional<Profesor> profesor = Optional.ofNullable(profesorService.findById(id).orElseThrow(() -> new Exception("Profesor" + id + " not found")));
        if(profesor.isPresent()){
            profesor.get().setNombre(profesorDetails.getNombre());
            profesor.get().setApellido(profesorDetails.getApellido());
            profesorService.update(profesor.get());
        }
        return "redirect:/userAdmin";
    }
    @PostMapping("/userAdmin/estudiante/delete/{id}")
    public String deleteEstudiante(@PathVariable("id") int id) throws Exception {
        Optional<Estudiante> estudiante = estudianteService.findById(id);
        if (estudiante.isPresent()) {
            estudianteService.delete(id);
        } else {
            throw new Exception("Estudiante " + id + " not found");
        }
        return "redirect:/userAdmin";
    }

    @PostMapping("/userAdmin/profesor/delete/{id}")
    public String deleteProfesor(@PathVariable("id") int id) throws Exception {
        Optional<Profesor> profesor = profesorService.findById(id);
        if (profesor.isPresent()) {
            profesorService.delete(id);
        } else {
            throw new Exception("Profesor " + id + " not found");
        }
        return "redirect:/userAdmin";
    }
}
