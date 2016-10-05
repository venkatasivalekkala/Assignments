package io.egen.similarDoctors.repository;

import java.util.List;

import io.egen.similarDoctors.entity.Doctors;

public interface DoctorRepository {

	Doctors findByEmail(String email);

	Doctors create(Doctors dt);

	List<Doctors> findAll();

	Doctors findone(String id);

	List<Doctors> findBySpecialty(String specialty);

	List<Doctors> findByArea(String area);

	List<Doctors> findByName(String name);

	List<Doctors> sortByReviewRatings();
	

}
