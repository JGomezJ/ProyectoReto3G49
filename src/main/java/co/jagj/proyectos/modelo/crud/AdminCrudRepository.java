/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.modelo.crud;

import co.jagj.proyectos.modelo.entidades.AdminUsuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TANATOS
 */
@Repository
@Component  
public interface AdminCrudRepository extends CrudRepository<AdminUsuario, Integer> {
    public List<AdminUsuario> findAll();
}
