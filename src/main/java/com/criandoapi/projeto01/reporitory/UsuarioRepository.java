package com.criandoapi.projeto01.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.criandoapi.projeto01.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
