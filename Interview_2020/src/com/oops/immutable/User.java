package com.oops.immutable;

public final class User {
	public final String firstname;
	public final String lastname;
	public Address address;
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
		return new Address(this.address.lcoality, this.address.city);
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}
	
	
}
