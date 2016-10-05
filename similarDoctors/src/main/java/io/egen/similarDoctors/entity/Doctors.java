package io.egen.similarDoctors.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table
@NamedQueries({ 
	@NamedQuery(name = "Doctors.findAll", query = "SELECT e FROM Doctors e"),
	@NamedQuery(name = "Doctors.sortByReviewRatings", query = "SELECT e FROM Doctors e ORDER BY e.reviewRating DESC"),
	@NamedQuery(name = "Doctors.findBySpecialty", query = "SELECT e FROM Movie e WHERE e.specialty=:pSpecialty"),
	@NamedQuery(name = "Doctors.findByEmail", query = "SELECT e FROM Doctors e WHERE e.email=:pEmail"),
	@NamedQuery(name = "Doctors.findByArea", query = "SELECT e FROM Doctors e WHERE e.area=:pArea"),
	@NamedQuery(name = "Doctors.findByName", query = "SELECT e FROM Doctors e WHERE e.name=:pName")
})


public class Doctors {
	
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String doctorId;
	private String name;
	private String specialty;
	private double reviewRating;
	private String area;
	private String city;
	@Column(unique = true)
	private String email;
	private String phone;
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public double getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(double reviewRating) {
		this.reviewRating = reviewRating;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
	

}
