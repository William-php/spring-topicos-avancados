package com.artigo.livraria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livraria")
public class LivrariaController {
	
	@GetMapping("/livro/{n}")
	public String getLivro(
			@RequestParam(value = "name", defaultValue = "World") String name	) {		
		
		return "Olá " + name;
	}
	
	
}
