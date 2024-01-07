package com.reeth.projectiberdrola.model;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "contrato")
public class Contract {
    @Id
    private Integer id;
    private Integer cups;
    private Integer id_tarifa;
    private Boolean homologado;
}