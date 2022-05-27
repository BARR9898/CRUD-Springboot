package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name =  "name",nullable = false)
	private String name;
	
	@Column(name =  "lastName",nullable = false)
	private String lastName;
	
	@Column(name =  "email", nullable = false , unique = true)
	private String email;
	


	public Estudiante(String name, String lastName, String email , Long id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}
	
	
	public Estudiante() {

	}
	





	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Estudiante [name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
	}


	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
		
	}

	public Long getId() {
		return id;
	}
	


	
	
	


}
