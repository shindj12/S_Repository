package test.servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {
	private static class EmfCreateHolder {
		public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

	}

	public static EntityManagerFactory getInstance() {
		return EmfCreateHolder.emf;
	}
	
	public static EntityManager getEntityManager() {
		return PersistenceManager.getInstance().createEntityManager();
	}

}
