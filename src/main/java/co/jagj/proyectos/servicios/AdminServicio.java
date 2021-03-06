/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.AdminCrudRepository;
import co.jagj.proyectos.modelo.entidades.AdminUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TANATOS
 */
@Service
@Transactional
public class AdminServicio {
    @Autowired
    AdminCrudRepository adminRepo;
    
    public AdminUsuario guardarAdmin(AdminUsuario adm){
        return adminRepo.save(adm);
    }
    
    public List<AdminUsuario> buscarTodo(){
        return (List<AdminUsuario>)adminRepo.findAll();
    }
}
