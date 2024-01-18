package com.example.proyecto_1_bbdd.models.dao;

import com.example.proyecto_1_bbdd.models.entity.UsersAdmin;

import java.util.List;

public interface UsersAdminDAO {
    void save(UsersAdmin usersAdmin);

    public void delete(int id);

    UsersAdmin getUserAdmin(int id);

    List<UsersAdmin> getAllUsersAdmin();
}
