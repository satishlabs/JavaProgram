package com.oops.immutable;

public class Address {
	String lcoality;
	String city;
	
	
	
	public Address(String lcoality, String city) {
		super();
		this.lcoality = lcoality;
		this.city = city;
	}
	public String getLcoality() {
		return lcoality;
	}
	public void setLcoality(String lcoality) {
		this.lcoality = lcoality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [lcoality=" + lcoality + ", city=" + city + "]";
	}
	
	
}
