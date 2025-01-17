package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("application-unit1");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManagerFactory.createEntityManager();
	}
}
