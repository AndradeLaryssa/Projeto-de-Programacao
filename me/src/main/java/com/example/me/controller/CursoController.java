package com.example.me.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.me.model.Curso;
import com.example.me.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository repository;
	
	@GetMapping
	public List<Curso> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public Curso criar(@RequestBody Curso curso) {
		return repository.save(curso);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Curso curso) {
		repository.delete(curso);
	
	}
		
	@PutMapping
	public Curso editar(@RequestBody Curso curso) {
		return repository.save(curso);

	}

}
