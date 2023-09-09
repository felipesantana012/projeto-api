package com.criandoapi.projeto01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // libera o securyt e deixar os endpoints abertos
public class Projeto01Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto01Application.class, args);
	}

}
