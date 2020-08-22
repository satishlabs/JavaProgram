package com.designpattern.parkinglot;

public class Car extends Vehicle{
	public Car() {
		spotsNeeded=2;
		size = VehicleSize.Compact;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		
		return false;
	}

}
