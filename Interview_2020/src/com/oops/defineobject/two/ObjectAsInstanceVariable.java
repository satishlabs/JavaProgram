package com.oops.defineobject.two;

//Defining object of a class as an instance variable of another class:

public class ObjectAsInstanceVariable {
	Sample sample = new Sample();
	public static void main(String[] args) {
		ObjectAsInstanceVariable obj = new ObjectAsInstanceVariable();
		obj.sample.setNum(10);
		
	}
}
