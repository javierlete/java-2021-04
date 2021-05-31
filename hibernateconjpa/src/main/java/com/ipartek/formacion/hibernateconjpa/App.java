package com.ipartek.formacion.hibernateconjpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("com.ipartek.formacion.hibernateconjpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		entityManager.persist(new Evento(null, "Primer evento", LocalDateTime.now(), "Descripción 1"));
		entityManager.persist(new Evento(null, "Segundo evento", LocalDateTime.of(1980, 12, 2, 12, 34), "Descripción 2"));
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		List<Evento> eventos = entityManager.createQuery( "from Evento", Evento.class ).getResultList();
		for(Evento evento: eventos) {
			System.out.println(evento);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
