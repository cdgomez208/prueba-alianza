package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.CreateCustomerDTO;
import com.prueba.tecnica.backend.dtos.CreateCustomerDTO.CreateCustomerDTOBuilder;
import com.prueba.tecnica.backend.dtos.CustomerDTO;
import com.prueba.tecnica.backend.entities.Customer;
import java.sql.Date;
import java.util.Objects;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-15T18:17:12-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO map(Customer source) {
        if ( source == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setNombre( source.getNombre() );
        customerDTO.setTelefono( source.getTelefono() );
        customerDTO.setCorreo( source.getCorreo() );
        customerDTO.setLlave( source.getLlave() );
        customerDTO.setFechaInicio( source.getFechaInicio() );
        customerDTO.setFechaFin( source.getFechaFin() );

        return customerDTO;
    }

    @Override
    public Customer map(CustomerDTO source) {
        if ( source == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setLlave( source.getLlave() );
        customer.setNombre( source.getNombre() );
        customer.setTelefono( source.getTelefono() );
        customer.setCorreo( source.getCorreo() );
        customer.setFechaInicio( source.getFechaInicio() );
        customer.setFechaFin( source.getFechaFin() );

        return customer;
    }

    @Override
    public CreateCustomerDTO mapCreate(Customer source) {
        if ( source == null ) {
            return null;
        }

        CreateCustomerDTOBuilder createCustomerDTO = CreateCustomerDTO.builder();

        createCustomerDTO.llave( source.getLlave() );
        createCustomerDTO.nombre( source.getNombre() );
        createCustomerDTO.telefono( source.getTelefono() );
        createCustomerDTO.correo( source.getCorreo() );
        if ( source.getFechaInicio() != null ) {
            createCustomerDTO.fechaInicio( new Date( source.getFechaInicio().getTime() ) );
        }
        if ( source.getFechaFin() != null ) {
            createCustomerDTO.fechaFin( new Date( source.getFechaFin().getTime() ) );
        }

        return createCustomerDTO.build();
    }

    @Override
    public Customer mapCreate(CreateCustomerDTO source) {
        if ( source == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setLlave( source.getLlave() );
        customer.setNombre( source.getNombre() );
        customer.setTelefono( source.getTelefono() );
        customer.setCorreo( source.getCorreo() );
        customer.setFechaInicio( source.getFechaInicio() );
        customer.setFechaFin( source.getFechaFin() );

        return customer;
    }
}
