package com.sample.dao;

public class UserDeatails extends Users {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String confirmEmail;
	private int mobile;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserDeatails [firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", email=" + email
				+ ", confirmEmail=" + confirmEmail + ", mobile=" + mobile + "]";
	}
	
	
}
