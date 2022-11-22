package com.hibernate.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserTest {

	public static void main(String[] args) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateDemo");

			EntityManager em = factory.createEntityManager();

			em.getTransaction().begin();
		
		//1. insert
		
		User u = new User();
		
		u.setFullname("Anish");
		u.setEmail("anish@gmail.com");
		u.setPassword("anish121");
		
		em.persist(u);
		
			em.getTransaction().commit();
			
			em.close();
			factory.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}