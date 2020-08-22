package com.designpattern.parkinglot;

public class Motorcycle extends Vehicle {
	 public Motorcycle() {
		spotsNeeded =2;
		size = VehicleSize.Motorcycle;
	}
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

}
