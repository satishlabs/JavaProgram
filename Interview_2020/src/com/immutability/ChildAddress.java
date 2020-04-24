package com.immutability;

public class ChildAddress extends Address{

	public ChildAddress(String firstLine, String secondLine, String city) {
		super(firstLine, secondLine, city);
	}
	
	public void setFirstLine(String firstLine) {
		throw new UnsupportedOperationException();
	}
	
	public void setSecondLine(String secondLine) {
		throw new UnsupportedOperationException();
	}
	
	public void setCity(String city) {
		throw new UnsupportedOperationException();
	}
}
