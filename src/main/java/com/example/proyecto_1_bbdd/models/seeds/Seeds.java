package com.example.proyecto_1_bbdd.models.seeds;

import com.example.proyecto_1_bbdd.models.dao.ClasesDAO;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import com.example.proyecto_1_bbdd.models.entity.Cursos;
import com.example.proyecto_1_bbdd.models.entity.Horario;
import com.example.proyecto_1_bbdd.models.entity.Profesor;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Seeds {
    private ClasesDAO clasesDAO;

    public Seeds(ClasesDAO clasesDAO) {
        this.clasesDAO = clasesDAO;
    }

    public void generateSeeds() {
        int horas = 8;
        int minutos = 30;
        int segundos = 0;
        Time horaInicio = new Time(horas, minutos, segundos);

        int horasFinal = 10;
        int minutosFinal = 30;
        int segundosFinal = 0;

        // Crea un objeto Time con la hora de inicio
        Time horaFinal = new Time(horasFinal, minutosFinal, segundosFinal);

        Profesor profesor1 = new Profesor("Juan", "Alonso", 639852106, "19606352V", "jalonso@gmail.com");
        Cursos curso1 = new Cursos("DAM", "Desarrollo de Aplicaciones Multiplataforma", "2023-09-10", "2024-06-22", true);
        Horario horario1 = new Horario(1, horaInicio, horaFinal, "2023-09-10");
        Clases ejemplo1 = new Clases(1, profesor1, Arrays.asList(curso1), Arrays.asList(horario1), "Clase1", "Rojo");

        Profesor profesor2 = new Profesor("Pablo", "Fernandes", 985236104, "12035667Q", "pablo.fernandes@gmail.com");
        Cursos curso2 = new Cursos("DAW", "Desarrollo de Aplicaciones Web", "2023-09-10", "2024-06-22", true);
        Horario horario2 = new Horario(1, horaInicio, horaFinal, "2023-09-10");
        Clases ejemplo2 = new Clases(2, profesor2, Arrays.asList(curso2), Arrays.asList(horario2), "Clase2", "Azul");

        Profesor profesor3 = new Profesor("Roberto", "Larcos", 745236981, "10526394Q", "robertolarcos@gmail.com");
        Cursos curso3 = new Cursos("ASIX", "Administración de Sistemas Informáticos en Red", "2023-09-10", "2024-06-22", true);
        Horario horario3 = new Horario(1, horaInicio, horaFinal, "2023-09-10");
        Clases ejemplo3 = new Clases(3, profesor3, Arrays.asList(curso3), Arrays.asList(horario3), "Clase3", "Verde");

        clasesDAO.save(ejemplo1);
        clasesDAO.save(ejemplo2);
        clasesDAO.save(ejemplo3);
    }

}
