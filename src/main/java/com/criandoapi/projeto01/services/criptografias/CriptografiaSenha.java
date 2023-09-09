package com.criandoapi.projeto01.services.criptografias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.criandoapi.projeto01.model.Usuario;



@Configuration
public class CriptografiaSenha {
	
		
	
		@Bean
	    public PasswordEncoder senhaCodificada() {
	        return new BCryptPasswordEncoder();
	    }
	
		public String criptografar(String obj) {
			return senhaCodificada().encode(obj);		
		}
		
		
		
		
	
	
	

}
