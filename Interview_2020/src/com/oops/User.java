package com.oops;

import java.util.ArrayList;
import java.util.Collections;


public final class User {
	private final String firstname;
	private final String lastname;
	private final ArrayList<Address> addressList;
	
	public User(String firstname, String lastname, ArrayList<Address> addressList) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.addressList = addressList;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public ArrayList<Address> getAddressList() {
		return (ArrayList)Collections.unmodifiableCollection(addressList);
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", addressList=" + addressList + "]";
	}
	
	
	
	
}
