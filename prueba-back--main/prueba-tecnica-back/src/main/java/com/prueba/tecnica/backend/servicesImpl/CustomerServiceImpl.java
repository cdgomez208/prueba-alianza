package com.prueba.tecnica.backend.servicesImpl;

import com.prueba.tecnica.backend.dtos.*;
import com.prueba.tecnica.backend.entities.Customer;
import com.prueba.tecnica.backend.mappers.CustomerMapper;
import com.prueba.tecnica.backend.repositories.CustomerRepository;
import com.prueba.tecnica.backend.services.CustomerService;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    CustomerMapper pqrMapper;


    @Override
    public CustomerResponse createCustomer(CreateCustomerDTO createCustomerDTO) throws Exception {

        String nombreCompleto= createCustomerDTO.getNombre();
        char primerCaracter = Character.toLowerCase(nombreCompleto.charAt(0));
        String[] partesNombre = nombreCompleto.split(" ");
        String apellido = partesNombre[1].toLowerCase();
        String llave = primerCaracter + apellido;
        createCustomerDTO.setLlave(llave);
        Customer customer = pqrMapper.mapCreate(createCustomerDTO);


        CustomerResponse customerResponse = new CustomerResponse();
        customer = customerRepository.save(customer);
        customerResponse.setCustomer(pqrMapper.map(customer));
        return customerResponse;
    }


    @Override
    public List<CustomerDTO> getAllCustomer() {
        return customerRepository.findAll().stream().map((user) -> mapToDto(user)
        ).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerDtoById(String idCustomer) {
        Customer pqr = getCustomerById(idCustomer);
        CustomerDTO dto = mapToDto(pqr);
        return dto;
    }

    @Override
    public Customer getCustomerById(String idCustomer) {
        return customerRepository.customerById(idCustomer);
    }




    private CustomerDTO mapToDto(Customer customer) {
        CustomerDTO dto = pqrMapper.map(customer);
        return dto;

    }






}
