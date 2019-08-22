package io.github.joaopaulorosa.cantina.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory emfCantina = Persistence.createEntityManagerFactory("cantina");
    
	public ConnectionFactory() {
				
	}
	
	public EntityManager getConnection() {
		return emfCantina.createEntityManager();
	}
	
	
	
	public static EntityManagerFactory getEmfCantina() {
		return emfCantina;
	}

	public static void setEmfCantina(EntityManagerFactory emfCantina) {
		ConnectionFactory.emfCantina = emfCantina;
	}
	
	
}
