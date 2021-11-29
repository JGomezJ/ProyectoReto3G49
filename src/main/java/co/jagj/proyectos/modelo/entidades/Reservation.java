/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author TANATOS
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Reservation")
@Data
@JsonIgnoreProperties({ "creationDate" })
@DynamicUpdate
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name= "IdReserva", nullable = false)
    private int idReservation;
        
    @Column(name= "FechaInicio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    
    @Column(name= "FechaEntrega", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date devolutionDate;
    
    // Default Value
    @Column(name = "status", nullable = false, updatable = false, insertable = false, columnDefinition = "varchar(7) default 'created'")
    private String status;
    
    @ManyToOne 
    @JsonIgnoreProperties({ "reservations" })
    private Library lib;
    
    @CreationTimestamp
    @Column(name= "FechaCreacion", nullable = false, updatable = false, insertable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    
    @ManyToOne 
    @JsonIgnoreProperties({"reservations", "messages"})
    private Client client;    
    
    @ManyToOne
    @JsonIgnoreProperties("reservations")   
    @JsonSetter(nulls=Nulls.AS_EMPTY)
    private Score score;
    
}
