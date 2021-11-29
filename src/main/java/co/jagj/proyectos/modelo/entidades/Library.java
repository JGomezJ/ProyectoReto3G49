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

public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name= "IdBiblioteca", nullable = false)
    /**
     * 
     * idLibrary
     */
    private int id;
        
    @Column(length = 45, name= "NombreBiblioteca", nullable = false)
    /**
     * nameLibrary
     */   
    private String name;
        
    @Column(length = 45, name= "ObjetivoUso", nullable = false)
    /**
     * targetLibrary
     */
    private String target;
    
    @Column(name= "Capacidad", nullable = false)
    /**
     * capacityLibrary
     */
    private int capacity; 
    
    @Column(length = 250, name= "Descripcion", nullable = false)
    /**
     * descriptionLibrary
     */
    private String description;
        
    @ManyToOne
    @JsonIgnoreProperties("libs")    
    /**
     * categoryLibrary
     */
    private Category category;
        
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "lib")
    @JsonIgnoreProperties({"lib", "client"}) 
    /**
     * messagesLibrary
     */
    List<Message> messages;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "lib")
    @JsonIgnoreProperties({"lib", "client" }) 
    /**
     * reservationsLibrary
     */
    List<Reservation> reservations;   
    
}
