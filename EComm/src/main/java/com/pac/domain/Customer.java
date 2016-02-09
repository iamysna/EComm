package com.pac.domain;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(schema="ecomerce",name="customerdetails")
public class Customer {
	
	@GenericGenerator(name="g1",strategy="foriegn",parameters=@Parameter(name ="property", value = "user"))
	@Id
@GeneratedValue(generator="g1")
	
	@Column(name="customerId")
private Integer customerId;
private String firstName;
private String lastName;
private Long mobileNumber;
private String emailId;
private String location;
private Integer age;
private String gender;
private String userType;
@OneToOne(targetEntity=User.class,fetch=FetchType.LAZY)
@PrimaryKeyJoinColumn

private User user;
/**
 * @return the userType
 */
public String getUserType() {
	return userType;
}
/**
 * @param userType the userType to set
 */
public void setUserType(String userType) {
	this.userType = userType;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the mobileNumber
 */
public Long getMobileNumber() {
	return mobileNumber;
}
/**
 * @param mobileNumber the mobileNumber to set
 */
public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the location
 */
public String getLocation() {
	return location;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}
/**
 * @return the age
 */
public Integer getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(Integer age) {
	this.age = age;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
}
