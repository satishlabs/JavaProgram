package com.spring.tightcoupling;

/*
 In the code the Journey class is dependents on Car class to provide service to the end user(main class to call this Journey class).
In the case Journey class is tightly coupled with Car class it means if any change in the Car class requires Journey class to change.
For example if Car class travel() method change to journey() method then you have to change the startJourney() method will call journey()
 method instead of calling travel() method. 
 */


public class Test {
	public static void main(String[] args) {
		Journey journey = new Journey();
		System.out.println("Journey started...");
		journey.startJourney();
	}
}
