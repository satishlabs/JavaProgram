package com.designpattern.parkinglot;

public class Bus extends Vehicle{
	
	public Bus() {
		spotsNeeded=2;
		size = VehicleSize.Large;
	}
	
	/* Checks if the spot is a Large. Doesn't check num of spots */
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

}
