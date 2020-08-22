package com.immutability;

public class User1{
	String firstname;
	String lastname;
	ChildAddress caddrress;
	public User1(String firstname, String lastname, ChildAddress caddrress) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.caddrress = caddrress;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public ChildAddress getCaddrress() throws CloneNotSupportedException{
		return (ChildAddress)caddrress;
	}
	
	
}
