package com.prueba.tecnica.backend.repositories;


import com.prueba.tecnica.backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, String> {


    @Query(value = "select * from clientes " +
            "where llave= :KEY", nativeQuery = true)
    Customer customerById(
            @Param("KEY") String  key

    );





}
