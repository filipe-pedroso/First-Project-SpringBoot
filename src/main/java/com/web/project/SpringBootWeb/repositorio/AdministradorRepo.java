package com.web.project.SpringBootWeb.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.web.project.SpringBootWeb.models.Administrador;

public interface AdministradorRepo extends CrudRepository<Administrador, Integer>{
    
}
