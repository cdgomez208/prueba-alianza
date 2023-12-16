package com.prueba.tecnica.backend.entities;


import com.prueba.tecnica.backend.dtos.CreateCustomerDTO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "\"clientes\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Customer implements Serializable {
    @Id
    @Column(name = "llave", nullable = false)
    private String llave;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    }




