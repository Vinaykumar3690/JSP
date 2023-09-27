package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Dto.Hospital;

public class HospitalDao {
	
	

	// Save Method
	public Hospital saveHospital(Hospital hospital) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (hospital != null) {

			entityTransaction.begin();
			entityManager.persist(hospital);
			entityTransaction.commit();
			return hospital;
		}

		return null;
	}

	// Update Method
	public Hospital updateHospital(Hospital hospital) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (hospital != null) {

			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return hospital;

		}
		return null;

	}
//Delete Method

	public Hospital DeleteHospital(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {

			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return hospital;
		}

		return null;

	}

// get by id
	public Hospital getHospitalbyid(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Hospital.class, id);
	}

//get all Hospital 

	public List<Hospital> getallHospital() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinay");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select a from Hospital a"); // jpql
		
		return query.getResultList();
	}
	
	
	
	

}
