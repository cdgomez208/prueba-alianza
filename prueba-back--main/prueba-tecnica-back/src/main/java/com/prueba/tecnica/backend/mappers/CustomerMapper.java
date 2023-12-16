package com.prueba.tecnica.backend.mappers;

import java.util.Objects;
import com.prueba.tecnica.backend.dtos.CreateCustomerDTO;
import com.prueba.tecnica.backend.dtos.CustomerDTO;
import com.prueba.tecnica.backend.entities.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper( imports = Objects.class )
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO map(Customer source);
    @InheritInverseConfiguration(name = "map")
    @Mapping(source= "llave", target= "llave")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "telefono", target= "telefono")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "fechaInicio", target= "fechaInicio")
    @Mapping(source= "fechaFin", target= "fechaFin")
    Customer
    map(CustomerDTO source);


    CreateCustomerDTO mapCreate(Customer source);
    @InheritInverseConfiguration(name = "mapCreate")
    @Mapping(source= "llave", target= "llave")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "telefono", target= "telefono")
    @Mapping(source= "correo", target= "correo")
    @Mapping(source= "fechaInicio", target= "fechaInicio")
    @Mapping(source= "fechaFin", target= "fechaFin")
    Customer mapCreate(CreateCustomerDTO source);

}