package com.reeth.projectiberdrola.model;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "cliente")
public class Client {
    @Id
    private Integer dni;
    private String nombre;
    private String apellido;
    private String direccion;        
    private String email;
    private String telefono;
    private Boolean cliente_antiguo;
    // getters and setters...
}