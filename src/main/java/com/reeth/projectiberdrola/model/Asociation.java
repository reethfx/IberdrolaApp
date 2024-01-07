package com.reeth.projectiberdrola.model;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "asocia")
public class Asociation {
    @Id
    private Integer dni;
    private Integer cups_contrato;
    private Integer cups_contador;

}
