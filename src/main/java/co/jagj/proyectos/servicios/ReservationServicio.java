/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.ReservationCrudRepository;
import co.jagj.proyectos.modelo.entidades.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class ReservationServicio {
    @Autowired
    ReservationCrudRepository reservationRepo;
    
    public void guardarReserva(Reservation res){
        reservationRepo.save(res);
    }
    
    public List<Reservation> buscarTodo(){
        return (List<Reservation>)reservationRepo.findAll();
    }
}
