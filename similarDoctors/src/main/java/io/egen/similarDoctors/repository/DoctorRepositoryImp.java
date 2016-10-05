package io.egen.similarDoctors.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.similarDoctors.entity.Doctors;

@Repository
public class DoctorRepositoryImp implements DoctorRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Doctors findByEmail(String email) {
		Doctors doctor  = em.find(Doctors.class, email);
		if(doctor!=null)
			return doctor;
		else return null;
	}

	@Override
	public Doctors create(Doctors dt) {
		em.persist(dt);
		 return dt;
	}

	@Override
	public List<Doctors> findAll() {
		TypedQuery<Doctors> query = em.createNamedQuery("Doctors.findAll", Doctors.class);
		return query.getResultList();
	}

	@Override
	public Doctors findone(String id) {
		Doctors doctor  = em.find(Doctors.class, id);
		if(doctor!=null)
			return doctor;
		else return null;
	}

	@Override
	public List<Doctors> findBySpecialty(String specialty) {
		TypedQuery<Doctors> query = em.createNamedQuery("Doctors.findBySpecialty", Doctors.class);
		query.setParameter("specialty", specialty);
		List<Doctors> doctors =query.getResultList();
		if ( doctors.size() > 0) {
			return doctors;
		}
		return null;
	}

	@Override
	public List<Doctors> findByArea(String area) {
		TypedQuery<Doctors> query = em.createNamedQuery("Doctors.findByArea", Doctors.class);
		query.setParameter("area", area);
		List<Doctors> doctors =query.getResultList();
		if ( doctors.size() > 0) {
			return doctors;
		}
		return null;
	}

	@Override
	public List<Doctors> findByName(String name) {
		TypedQuery<Doctors> query = em.createNamedQuery("Doctors.findByName", Doctors.class);
		query.setParameter("name", name);
		List<Doctors> doctors =query.getResultList();
		if ( doctors.size() > 0) {
			return doctors;
		}
		return null;
	}

	@Override
	public List<Doctors> sortByReviewRatings() {
		TypedQuery<Doctors> query = em.createNamedQuery("Doctors.sortByReviewRatings", Doctors.class);
		List<Doctors> doctors =query.getResultList();
		if ( doctors.size() > 0) {
			return doctors;
		}
		return null;
	}

}
