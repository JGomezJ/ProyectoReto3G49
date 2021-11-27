/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.CategoryCrudRepository;
import co.jagj.proyectos.modelo.entidades.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class CategoryServicio {
    @Autowired
    CategoryCrudRepository categoryRepo;
    
    public Category guardarCategoria(Category cat){
        return categoryRepo.save(cat);
    }
    
    public List<Category> buscarTodo(){
        return (List<Category>)categoryRepo.findAll();
    }
}
