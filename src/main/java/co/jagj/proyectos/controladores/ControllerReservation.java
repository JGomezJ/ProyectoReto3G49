/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.controladores;

import co.jagj.proyectos.modelo.entidades.Reservation;
import co.jagj.proyectos.servicios.ReservationServicio;
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
public class ControllerReservation {
    @Autowired
    ReservationServicio reservationServicio;
    
    // Crud por JAGJ
    @GetMapping("/Reservation/all")
    public List<Reservation> buscarTodo() {
        return reservationServicio.buscarTodo();
    }
    
    @PostMapping("/Reservation/save")
    public ResponseEntity<?> guardarReserva(@RequestBody Reservation res) {
        reservationServicio.guardarReserva(res);        
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
