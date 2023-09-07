package com.criandoapi.projeto01.services.excecoes;

public class BancoDadosExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BancoDadosExcecao(String msg) {
		super(msg);
	}

}
