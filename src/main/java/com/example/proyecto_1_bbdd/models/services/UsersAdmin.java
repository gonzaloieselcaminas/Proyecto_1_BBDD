package com.example.proyecto_1_bbdd.models.services;

import com.example.proyecto_1_bbdd.models.dao.UsersAdminDAO;
import com.example.proyecto_1_bbdd.models.entity.Clases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersAdmin implements IUsersAdminService {

    @Autowired
    private UsersAdminDAO usersAdminDAO;

    @Override
    public List<com.example.proyecto_1_bbdd.models.entity.UsersAdmin> findAll() {
        return this.usersAdminDAO.findAll();
    }

    @Override
    public Optional<com.example.proyecto_1_bbdd.models.entity.UsersAdmin> findById(int id) {
        return usersAdminDAO.findById((long) id);
    }

    @Override
    public com.example.proyecto_1_bbdd.models.entity.UsersAdmin create(com.example.proyecto_1_bbdd.models.entity.UsersAdmin usersAdmin) {
        return usersAdminDAO.save(usersAdmin);
    }

    @Override
    public com.example.proyecto_1_bbdd.models.entity.UsersAdmin update(com.example.proyecto_1_bbdd.models.entity.UsersAdmin usersAdmin) {
        com.example.proyecto_1_bbdd.models.entity.UsersAdmin currentUserAdmin = usersAdminDAO.findById((long) usersAdmin.getId()).get();
        currentUserAdmin.setNombre(usersAdmin.getNombre());
        currentUserAdmin.setName(usersAdmin.getName());
        currentUserAdmin.setEmail(usersAdmin.getEmail());
        currentUserAdmin.setPassword(usersAdmin.getPassword());
        return usersAdminDAO.save(currentUserAdmin);
    }

    @Override
    public void delete(int id) {
        Optional<com.example.proyecto_1_bbdd.models.entity.UsersAdmin> usersAdmins = usersAdminDAO.findById((long) id);
        System.out.println(usersAdmins);
        usersAdminDAO.deleteById((long) id);
    }
}
