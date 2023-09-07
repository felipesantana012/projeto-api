package com.criandoapi.projeto01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criandoapi.projeto01.model.Usuario;
import com.criandoapi.projeto01.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> buscarTodos(){
		List<Usuario> list = usuarioService.findAll();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> buscarUm(@PathVariable Integer id){
		Usuario obj = usuarioService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
