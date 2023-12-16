package com.prueba.tecnica.backend.dtos;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;


@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
public class CreateCustomerDTO {

	private String llave;

	private String nombre;

	private String telefono;

	private String correo;

	private Date fechaInicio;

	private Date fechaFin;


}
