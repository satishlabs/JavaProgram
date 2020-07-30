package com.spring.loosecoupling;

public class Journey {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		Vehicle v1 = new Bike();
		v1.start();
	}
}
