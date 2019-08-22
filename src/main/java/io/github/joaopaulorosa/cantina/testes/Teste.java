package io.github.joaopaulorosa.cantina.testes;

import javax.persistence.EntityManager;

import io.github.joaopaulorosa.cantina.connection.ConnectionFactory;
import io.github.joaopaulorosa.cantina.model.cadastro.Turma;

public class Teste {

	public static void main (String[] args ) {
		
		
		EntityManager em = new ConnectionFactory().getConnection();
		
		
		em.close();
		
		
	}
	
}
