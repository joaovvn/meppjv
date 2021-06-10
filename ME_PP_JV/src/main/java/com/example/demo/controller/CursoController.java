package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Curso;
import com.example.demo.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository cr; 
	
	@GetMapping
	public List<Curso> list(){
		return cr.findAll();	
	}
	
	@PostMapping
	public Curso create(@RequestBody Curso c) {
		return cr.save(c);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Curso c) {
		cr.delete(c);
	}	
	
	@PutMapping
	public Curso update(@RequestBody Curso c) {
		return cr.save(c);
	}
}
