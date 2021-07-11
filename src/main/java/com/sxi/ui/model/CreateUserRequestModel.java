package com.sxi.ui.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;


public class CreateUserRequestModel {
	
	@NotNull(message = "Firstname cannot be null")
	@Size(min=2, message= "Firstname must not be less than two characters")
	private String firstName;
	
	@NotNull(message = "Lastname cannot be null")
	@Size(min=2, message= "Lastname must not be less than two characters")
	private String lastName;
	
	@NotNull(message = "Password cannot be null")
	@Size(min=8, max=16, message= "Password must be >= 8 and <= 16 characters")
	private String password;
	
	@NotNull(message = "Email cannot be null")
	@Email
	private String email;
	
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
