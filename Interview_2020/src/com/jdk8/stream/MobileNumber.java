package com.jdk8.stream;

public class MobileNumber {
	private String number;
	
	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MobileNumber [number=" + number + "]";
	}
	
	
}
