package io.egen.similarDoctors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.egen.similarDoctors.entity.Doctors;
import io.egen.similarDoctors.service.DoctorService;

@RestController
@RequestMapping(path = "doctors")
public class DoctorController {
	
	@Autowired
	DoctorService doctorservice;
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Doctors create(@RequestBody Doctors dt) {
		System.out.println("Inside the controller  create");
		return doctorservice.createDoctor(dt);
	}
	@RequestMapping(method = RequestMethod.GET,path = "findDoctorById/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Doctors findById(@PathVariable("id") String id){
		return doctorservice.findById(id);
	}
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctors> findAll(){
		return doctorservice.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "findByName/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctors> findByName(@PathVariable("name") String name){
		return doctorservice.findByName(name);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "specificallyty/{specificallyty}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctors> findBySpecialty(@PathVariable("specificallyty") String specialty){
		return doctorservice.findBySpecialty(specialty);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "area/{area}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctors> findByArea(@PathVariable("area") String area){
		return doctorservice.findByArea(area);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "reviewRating/{reviewRating}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Doctors> sortByReviewRatings(){
		return doctorservice.sortByReviewRatings();
	}
	

}
