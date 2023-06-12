package br.com.cod3r.exerciciossp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public int calculadora(@PathVariable int a,@PathVariable int b) {
		return a + b;

	}
	@GetMapping("/mult/{a}/{b}")
	public int mult(@PathVariable int a,@PathVariable int b) {
		return a * b;
		
	}
	@GetMapping("/div/{a}/{b}")
	public int div(@PathVariable int a,@PathVariable int b) {
		return a / b;
		
	}
	
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a")int a,@RequestParam(name = "b")int b) {
		return a - b;
	}
}
