package com.prueba.tecnica.backend.utils;

import com.prueba.tecnica.backend.dtos.CustomerDTO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;


public class CSVUtil {

    /*public static ByteArrayInputStream writeToCSV(List<CustomerDTO> clientes) {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             CSVWriter csvWriter = new CSVWriter(new OutputStreamWriter(out))) {

            // Escribir datos al CSV
            for (CustomerDTO cliente : clientes) {
                String[] data = {
                        cliente.getColumna1(),
                        cliente.getColumna2(),
                        // Agrega más columnas según sea necesario
                };
                csvWriter.writeNext(data);
            }

            csvWriter.close();
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException | IOException e) {
            e.printStackTrace();
            // Maneja la excepción adecuadamente según tus necesidades
            return null;
        }
    }*/
}
