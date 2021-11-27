/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.controladores;

import co.jagj.proyectos.modelo.entidades.Category;
import co.jagj.proyectos.servicios.CategoryServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author TANATOS
 */
@RestController
@RequestMapping("/api/Category")
public class ControllerCategory {
    @Autowired
    CategoryServicio categoryServicio;
    
    // Crud por JAGJ
    @GetMapping("/all")
    public List<Category> buscarTodo() {
        return categoryServicio.buscarTodo();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category guardarCategoria(@RequestBody Category cat) {
        return categoryServicio.guardarCategoria(cat);
    }
    
    /*
    @PostMapping("/save")
    public ResponseEntity<?> guardarCategoria(@RequestBody Category cat) {
        categoryServicio.guardarCategoria(cat);        
        return ResponseEntity.status(201).build();
    }*/
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
