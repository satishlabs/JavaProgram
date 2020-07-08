package com.array.smiths.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Car{
	boolean isSedan;
	String seats;
	public Car(boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}
	boolean getIsSedan() {
		return isSedan;
		
	}
	
	String getSeats() {
		return seats;
		
	}
	
	String getMileage() {
		return seats;
		
	}
}

class WagonR extends Car{

	public WagonR(boolean isSedan, String seats) {
		super(isSedan, seats);
		
	}
	@Override
	String getMileage() {
		return super.getMileage();
	}
	
}

class HondaCity extends Car{

	public HondaCity(boolean isSedan, String seats) {
		super(isSedan, seats);
		// TODO Auto-generated constructor stub
	}
	
}
class InnovaCrysta extends Car{

	public InnovaCrysta(boolean isSedan, String seats) {
		super(isSedan, seats);
		// TODO Auto-generated constructor stub
	}
	
}

public class Solution {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int carType = Integer.parseInt(bufferedReader.readLine().trim());
	        int carMileage = Integer.parseInt(bufferedReader.readLine().trim());
	        
	        if (carType == 0){
	            Car wagonR = new WagonR(carMileage);
	            wagonR.printCar("WagonR");
	        }
	        
	        if(carType == 1){
	            Car hondaCity = new HondaCity(carMileage);
	            hondaCity.printCar("HondaCity");
	        }
	        
	        if(carType == 2){
	            Car innovaCrysta = new InnovaCrysta(carMileage);
	            innovaCrysta.printCar("InnovaCrysta");
	        }
	    }
}
