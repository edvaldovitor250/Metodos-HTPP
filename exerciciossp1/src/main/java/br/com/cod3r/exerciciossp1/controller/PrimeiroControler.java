package br.com.cod3r.exerciciossp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControler {

	@GetMapping
	public String ola() {
		return "Olá, meu teste para o Spring Boot";
	}

}
