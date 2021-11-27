/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.servicios;

import co.jagj.proyectos.modelo.crud.ClientCrudRepositoy;
import co.jagj.proyectos.modelo.entidades.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TANATOS
 */
@Service
public class ClientServicio {
    @Autowired
    ClientCrudRepositoy clientRepo;
    
    public Client guardarCliente(Client cli){
       return clientRepo.save(cli);
    }
    
    public List<Client> buscarTodo(){
        return (List<Client>)clientRepo.findAll();
    }
}
