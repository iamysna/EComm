package com.beingjavaguys.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Employee {

	@Id
	@GeneratedValue
	

	private int id;
	
	//@Size(min=3, max=30)
	// @NotEmpty(message="Name field is mandatory.")

	@Column(name="first_name")
	private String firstName;
	
	//@Size(min=3, max=30)
	//@NotEmpty
	@Column(name="last_name")
	private String lastName;
	
	//@Pattern(regexp=".+@.+\\.[a-z]+")
	//@Email
	private String email;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
