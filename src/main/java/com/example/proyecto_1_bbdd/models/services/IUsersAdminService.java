package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.entity.UsersAdmin;

import java.util.List;
import java.util.Optional;

public interface IUsersAdminService {
    List<UsersAdmin> findAll();
    Optional<UsersAdmin> findById(int id);
    UsersAdmin create(UsersAdmin usersAdmin);
    UsersAdmin update(UsersAdmin usersAdmin);
    void delete(int id);
}
