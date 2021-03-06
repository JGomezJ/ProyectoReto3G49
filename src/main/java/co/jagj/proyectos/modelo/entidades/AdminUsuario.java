/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.jagj.proyectos.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="Admin")
@Entity
public class AdminUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdAdmon", nullable = false)
    private int idUserAdmon;
    
    @Column(length = 250, name="NombreAdmon", nullable = false)
    private String name;    
    
    @Column(length = 45, name="Correo", nullable = false)
    private String email;
    
    @Column(length = 45, name="Contrasena", nullable = false)
    private String password;
    
}
