/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.controladores;

import co.jagj.proyectos.modelo.entidades.Client;
import co.jagj.proyectos.servicios.ClientServicio;
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
@RequestMapping("/api/Client")
public class ControllerClient {
    @Autowired
    ClientServicio clientServicio;
    
    // Crud por JAGJ
    @GetMapping("/all")
    public List<Client> buscarTodo() {
        return clientServicio.buscarTodo();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client guardarCliente(@RequestBody Client lib) {
        return clientServicio.guardarCliente(lib);        
    }
    
    /*
    @PostMapping("/Client/save")
    public ResponseEntity<?> guardarCliente(@RequestBody Client lib) {
        clientServicio.guardarCliente(lib);        
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
