/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="Client")
@Data
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "IdCliente", nullable = false)
    private int idClient;
    
    @Column(length = 45, name= "Email", nullable = false)
    private String email;
        
    @Column(length = 45, name= "Contrasena", nullable = false)
    private String password;
    
    @Column(length = 250, name= "NombreCliente", nullable = false)
    private String name;
        
    @Column(name= "Edad", nullable = false)
    private int age;
        
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client") 
    @JsonIgnoreProperties({ "client", "messages", "reservations" }) 
    List<Message> messages;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
    @JsonIgnoreProperties({ "reservations", "client", "messages", "lib" }) 
    List<Reservation> reservations;
    
}
