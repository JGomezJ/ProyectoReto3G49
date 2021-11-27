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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author TANATOS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Library")
@Entity
//@JsonIgnoreProperties({ "reservations" })
public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name= "IdBiblioteca", nullable = false)
    private int id;
        
    @Column(length = 45, name= "NombreBiblioteca", nullable = false)
    private String name;
        
    @Column(length = 45, name= "ObjetivoUso", nullable = false)
    private String target;
    
    @Column(name= "Capacidad", nullable = false)
    private int capacity; 
    
    @Column(length = 250, name= "Descripcion", nullable = false)
    private String description;
        
    @ManyToOne
    @JsonIgnoreProperties("libs")    
    private Category category;
        
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "lib")
    @JsonIgnoreProperties({"lib", "client"}) 
    List<Message> messages;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "lib")
    @JsonIgnoreProperties({"lib", "client" }) 
    List<Reservation> reservations;   
    
}