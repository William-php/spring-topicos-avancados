package com.artigo.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.artigo.livraria.entity.LivroEntity;
import com.artigo.livraria.repositories.LivroRepository;

@RestController
@RequestMapping("/livraria")
public class LivrariaController {
	
	@Autowired
	LivroRepository livroRepo;
	
	@GetMapping("/livro")
	public List<LivroEntity> getLivros() {		
		return this.livroRepo.findAll();
	}
	
	@GetMapping("/livro/{id}")
	public LivroEntity getLivro(@PathVariable Long id) {		
		return livroRepo.findById(id).get();
	}
	
	@PostMapping("/add")
	public LivroEntity postLivro(@RequestBody LivroEntity livro) {
		return this.livroRepo.save(livro);
	}
	
	
	
}
