package com.criandoapi.projeto01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criandoapi.projeto01.model.Usuario;
import com.criandoapi.projeto01.reporitory.UsuarioRepository;
import com.criandoapi.projeto01.services.excecoes.RecursoNaoEncontradoExcecao;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	//buscar todos usuarios
	public List<Usuario>findAll(){
		return usuarioRepository.findAll();
	}
	
	//buscar um usuario por id
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new RecursoNaoEncontradoExcecao(id));	
	}
	
}
