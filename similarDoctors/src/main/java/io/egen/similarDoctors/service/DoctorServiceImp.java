package io.egen.similarDoctors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.similarDoctors.entity.Doctors;
import io.egen.similarDoctors.repository.DoctorRepository;

@Service
public class DoctorServiceImp implements DoctorService{
	
	@Autowired
	DoctorRepository doctorrepository;

	@Override
	@Transactional
	public Doctors createDoctor(Doctors dt) {
		Doctors existing = doctorrepository.findByEmail(dt.getEmail());
		if (existing != null) {
			return null;
		}
		return doctorrepository.create(dt);
	}

	@Override
	public List<Doctors> findAll() {
		return doctorrepository.findAll();
	}

	@Override
	public Doctors findById(String id) {
		Doctors doctor  = doctorrepository.findone(id);
		if(doctor!=null)
			return doctor;
		else{
			return null;
		}
	}

	@Override
	public List<Doctors> findBySpecialty(String specialty) {
		return doctorrepository.findBySpecialty(specialty);
		
	}

	@Override
	public List<Doctors> findByArea(String area) {
		return doctorrepository.findByArea(area);
	}

	@Override
	public List<Doctors> sortByReviewRatings() {
		return doctorrepository.sortByReviewRatings();
	}

	@Override
	public List<Doctors> findByName(String name) {
		return doctorrepository.findByName(name);
	}

}
