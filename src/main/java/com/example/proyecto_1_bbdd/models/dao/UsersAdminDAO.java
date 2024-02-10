package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.UsersAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersAdminDAO extends JpaRepository<UsersAdmin, Long> {

}
