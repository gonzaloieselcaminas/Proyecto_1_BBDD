package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

public class ClasesDaoImpl implements ClasesDAO {

    private final JdbcTemplate jdbcTemplate;

    public ClasesDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Clases clases) {
        int id = clases.getId();
        Profesor id_profesor = clases.getId_profesor();
        List<Cursos> cursos = clases.getId_curso();
        List<Horario> horarios = clases.getId_horario();
        String nombre = clases.getNombre();
        String color = clases.getColor();
        List<Notas> notas = clases.getNotas();

        String sql = "INSERT INTO clases (id, id_profesor, clase, nombre, color, clases) VALUES (?, ?, ?, ?, ?, ?)";

        int affectedRows = jdbcTemplate.update(sql, id, id_profesor, cursos, nombre, color, notas);
        if (affectedRows > 0) {
            System.out.println("Nueva clase creada");
        } else {
            System.out.println("Error al crear la nueva clase");
        }
        getAllClases();
    }

    @Override
    public Clases getClase(int id) {
        String sql = "SELECT * FROM task WHERE id = ?";
        List<Clases> clases = jdbcTemplate.query(sql, new Object[]{id}, (resultSet, rowNum) ->
                new Clases(
                        resultSet.getInt("id"),
                        Arrays.asList(resultSet.getString("cursos")),
                        Arrays.asList(resultSet.getString("horarios")),
                        resultSet.getString("nombre"),
                        resultSet.getString("color")
                )
        );
        System.out.println(sql);
        return clases.isEmpty() ? null : clases.get(0);
    }

    @Override
    public List<Clases> getAllClases() {
        String sql = "SELECT * FROM task WHERE id = ?";
        List<Clases> clases = jdbcTemplate.query(sql, new Object[]{id}, (resultSet, rowNum) ->
                new Clases(
                        resultSet.getInt("id"),
                        Arrays.asList(resultSet.getString("cursos")),
                        Arrays.asList(resultSet.getString("horarios")),
                        resultSet.getString("nombre"),
                        resultSet.getString("color")
                )
        );
    }

    @Override
    public void deleteClase(int id) {
        String sql = "DELETE FROM clases WHERE id = ?";
        int affectedRows = jdbcTemplate.update(sql, id);
        if (affectedRows > 0) {
            System.out.println("Clase eliminada exitosamente");
        } else {
            System.out.println("No se encontró la clase con ID: " + id);
        }
        getAllClases();
    }

    @Override
    public void deleteAllClases() {
        String sql = "DELETE FROM task";
        int affectedRows = jdbcTemplate.update(sql);
        System.out.println("Se eliminaron " + affectedRows + " tareas.");
    }
}
