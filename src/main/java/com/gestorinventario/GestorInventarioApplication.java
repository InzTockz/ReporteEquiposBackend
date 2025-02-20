package com.gestorinventario;

import com.gestorinventario.entity.AreasEntity;
import com.gestorinventario.entity.UsuarioAsignadoEntity;
import com.gestorinventario.repository.UsuarioAsignadoRepository;
import com.gestorinventario.services.UsuarioAsignadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorInventarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestorInventarioApplication.class, args);
    }
}
