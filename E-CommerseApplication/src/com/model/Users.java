package com.model;

public class Users {
	private int userId;
	private String firstName;
	private String lastName;
	private String usename;
	private String password;
	private String city;
	private String email;
	private String mobileNumber;
	public Users(int userId, String firstName, String lastName, String usename, String password, String city,
			String email, String mobileNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.usename = usename;
		this.password = password;
		this.city = city;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", usename="
				+ usename + ", password=" + password + ", city=" + city + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
	
	

}
