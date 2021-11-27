/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.controladores;

import co.jagj.proyectos.modelo.entidades.Library;
import co.jagj.proyectos.servicios.LibraryServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author TANATOS
 */
@RestController
@RequestMapping("/api")
public class ControllerLibrary {
    @Autowired
    LibraryServicio libraryServicio;
    
    // Crud por JAGJ
    @GetMapping("/Lib/all")
    public List<Library> buscarTodo() {
        return libraryServicio.buscarTodo();
    }
    
    @PostMapping("/Lib/save")
    public ResponseEntity<?> guardarLibreria(@RequestBody Library lib) {
        libraryServicio.guardarLibreria(lib);        
        return ResponseEntity.status(201).build();
    }
//    
//    // Crud RestController
//    @GetMapping()
//    public List<Object> list() {
//        return null;
//    }
//    
//    @GetMapping("/{id}")
//    public Object get(@PathVariable String id) {
//        return null;
//    }
//    
//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
//        return null;
//    }
//    
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Object input) {
//        return null;
//    }
//    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
//    
}
