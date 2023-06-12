package br.com.cod3r.exerciciossp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossp1.model.entities.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping(path = "/qualquer1")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.213.123-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.543.325-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id",defaultValue = "1") int id) {
		return new Cliente(id, "Edvaldo", "245.098.543-10");
	}
}
