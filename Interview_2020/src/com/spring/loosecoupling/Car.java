package com.spring.loosecoupling;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Travle by Car");
	}

}
