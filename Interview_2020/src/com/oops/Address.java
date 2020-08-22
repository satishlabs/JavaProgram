package com.oops;

public class Address {
	String firstname;
	String secondname;
	String city;
	public Address(String firstname, String secondname, String city) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.city = city;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [firstname=" + firstname + ", secondname=" + secondname + ", city=" + city + "]";
	}
	
	
}
