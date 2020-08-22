package com.spring.tightcoupling;

public class Journey {
	Car car = new Car();
	public void startJourney() {
		car.travel();
	}
}
