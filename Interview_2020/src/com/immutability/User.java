package com.immutability;

public final class User {
	private final String firstname;
	private final String lastname;
	private final Address address;
	public User(String firstname, String lastname, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}
	
	
}
