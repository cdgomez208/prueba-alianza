package com.prueba.tecnica.backend.dtos;



import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CustomerResponse {

	private CustomerDTO customer;

}
