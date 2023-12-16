package com.prueba.tecnica.backend.controllers;


import java.net.URI;
import com.prueba.tecnica.backend.dtos.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.prueba.tecnica.backend.servicesImpl.CustomerServiceImpl;

@RequestMapping("customers")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;


	@ApiOperation(value = "get customer by Id", response = ResponseDTO.class)
	@RequestMapping(value = "getId/{idCustomer}", method = RequestMethod.GET)
	public ResponseEntity<?> getCustomer(@PathVariable String idCustomer) {
		return ResponseEntity.ok(customerService.getCustomerById(idCustomer));
	}

	@ApiOperation(value = "getAlls", response = ResponseDTO.class)
	@RequestMapping(value = "getAlls", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCustomers() {
		return ResponseEntity.ok(customerService.getAllCustomer());
	}

	@ApiOperation(value = "create Customer", response = ResponseDTO.class)
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ResponseEntity<?> createCustomer(@RequestBody CreateCustomerDTO dto) throws Exception {

		CustomerResponse response = customerService.createCustomer(dto);
		return ResponseEntity.created(URI.create("/customers/v1" ))
				.body(response);
	}


}