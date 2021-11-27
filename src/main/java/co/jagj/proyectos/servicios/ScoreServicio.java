/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.ScoreCrudRepository;
import co.jagj.proyectos.modelo.entidades.Score;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class ScoreServicio {
    @Autowired
    ScoreCrudRepository scoreRepo;
    
    public void guardarScoreReserva(Score sco){
        scoreRepo.save(sco);
    }
    
    public List<Score> buscarTodo(){
        return (List<Score>)scoreRepo.findAll();
    }
}
