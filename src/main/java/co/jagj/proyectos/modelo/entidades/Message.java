/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author TANATOS
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Message")
@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "IdMensaje", nullable = false)
    private int idMessage;
    
    @Column(length = 250, name= "Texto", nullable = false)    
    private String messageText;
        
    @ManyToOne
    @JsonIgnoreProperties({ "messages", "reservations" }) 
    private Library lib;
        
    @ManyToOne
    @JsonIgnoreProperties({ "messages", "reservations" })
    private Client client;
    
}
