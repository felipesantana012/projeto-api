package com.criandoapi.projeto01.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table(name = "tb_usuario")
public class Usuario {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "O nome e obrigatorio!")
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Email(message = "Informe um email valido!")
	@NotBlank(message = "O email e obrigatorio!")
	@Column(length = 100, nullable = false)
	private String email;
	
	@NotBlank(message = "A senha e obrigatoria!")
	@Column(columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@NotBlank(message = "O telefone e obrigatorio!")
	@Column(length = 15, nullable = false)
	private String telefone;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
