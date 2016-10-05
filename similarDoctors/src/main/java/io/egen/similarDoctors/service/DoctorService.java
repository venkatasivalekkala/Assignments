package io.egen.similarDoctors.service;

import java.util.List;

import io.egen.similarDoctors.entity.Doctors;

public interface DoctorService {

	Doctors createDoctor(Doctors dt);

	List<Doctors> findAll();

	Doctors findById(String id);

	List<Doctors> findBySpecialty(String specificallyty);

	List<Doctors> findByArea(String area);

	List<Doctors> sortByReviewRatings();

	List<Doctors> findByName(String name);

}
