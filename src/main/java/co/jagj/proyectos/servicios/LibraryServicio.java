/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.LibraryCrudRepository;
import co.jagj.proyectos.modelo.entidades.Library;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class LibraryServicio {
    @Autowired
    LibraryCrudRepository libraryRepo;
    
    public void guardarLibreria(Library lib){
        libraryRepo.save(lib);
    }
    
    public List<Library> buscarTodo(){
        return (List<Library>)libraryRepo.findAll();
    }
}
