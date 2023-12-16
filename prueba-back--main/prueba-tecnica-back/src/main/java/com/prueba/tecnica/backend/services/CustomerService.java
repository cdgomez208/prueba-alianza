package com.prueba.tecnica.backend.services;

import java.util.List;

import com.prueba.tecnica.backend.dtos.*;
import com.prueba.tecnica.backend.entities.*;


public interface CustomerService {


	CustomerResponse createCustomer(CreateCustomerDTO createCustomerDTO) throws Exception;

	List<CustomerDTO> getAllCustomer();

	CustomerDTO getCustomerDtoById(String idCustomer);

	Customer getCustomerById(String idCustomer);




}
