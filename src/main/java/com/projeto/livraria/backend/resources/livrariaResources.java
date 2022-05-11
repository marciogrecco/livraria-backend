package com.projeto.livraria.backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livraria")
public class livrariaResources {

	@GetMapping
	public String livraria() {
		return "Olá Spring Boot";
	}

}
