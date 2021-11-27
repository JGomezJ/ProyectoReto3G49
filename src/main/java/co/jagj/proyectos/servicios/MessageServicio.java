/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.MessageCrudRepository;
import co.jagj.proyectos.modelo.entidades.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class MessageServicio {
    @Autowired
    MessageCrudRepository messageRepo;
    
    public void guardarMensaje(Message mes){
        messageRepo.save(mes);
    }
    
    public List<Message> buscarTodo(){
        return (List<Message>)messageRepo.findAll();
    }
}
