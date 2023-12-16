package com.prueba.tecnica.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CustomerDTO {


    private String nombre;

    private String telefono;

    private String correo;

    private String llave;

    private Date fechaInicio;


    private Date fechaFin;
}
