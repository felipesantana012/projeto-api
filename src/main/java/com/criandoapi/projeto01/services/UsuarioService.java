package com.criandoapi.projeto01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criandoapi.projeto01.model.Usuario;
import com.criandoapi.projeto01.reporitory.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public List<Usuario>findAll(){
		return usuarioRepository.findAll();
	}
	
	
}
