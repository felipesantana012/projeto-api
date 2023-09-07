package com.criandoapi.projeto01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.criandoapi.projeto01.model.Usuario;
import com.criandoapi.projeto01.reporitory.UsuarioRepository;
import com.criandoapi.projeto01.services.excecoes.BancoDadosExcecao;
import com.criandoapi.projeto01.services.excecoes.RecursoNaoEncontradoExcecao;

import jakarta.persistence.EntityNotFoundException;

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
	
	
	public Usuario insert(Usuario obj) {
		return usuarioRepository.save(obj);
		}
	
	
	public void delete(Integer id) {
		try {
			usuarioRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new RecursoNaoEncontradoExcecao(id);
		}catch(DataIntegrityViolationException e) {
			throw new BancoDadosExcecao(e.getMessage());
		}
	}
	
	public Usuario update(Integer id, Usuario obj) {
		try {
			Usuario usuario = usuarioRepository.getReferenceById(id);
			atualizarDados(usuario, obj);
			return usuarioRepository.save(usuario);
			
		}catch(EntityNotFoundException e) {
			throw new RecursoNaoEncontradoExcecao(id);
		}
		
	}

	private void atualizarDados(Usuario usuario, Usuario obj) {
		
		usuario.setNome(obj.getNome());
		usuario.setEmail(obj.getEmail());
		usuario.setTelefone(obj.getTelefone());
		
	}
	
}
