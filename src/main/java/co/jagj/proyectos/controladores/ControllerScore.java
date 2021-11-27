/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.controladores;

import co.jagj.proyectos.modelo.entidades.Score;
import co.jagj.proyectos.servicios.ScoreServicio;
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
public class ControllerScore {
    @Autowired
    ScoreServicio scoreServicio;
    
    // Crud por JAGJ
//    @GetMapping("/Score/all")
//    public List<Score> buscarTodo() {
//        return scoreServicio.buscarTodo();
//    }
    
    @PostMapping("/Score/save")
    public ResponseEntity<?> guardarScoreReserva(@RequestBody Score sco) {
        scoreServicio.guardarScoreReserva(sco);        
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
