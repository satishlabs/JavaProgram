package com.designpattern.parkinglot;

public class Level {
	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots=0;  //number of free spots
	private static final int SPOTS_PER_ROW=10;
	
	public Level(int flr,int numberSpots) {
		this.floor=flr;
		this.availableSpots = numberSpots;
	}
	
	public int availableSpots() {
		return availableSpots;
	}
	// Find a place to park this vehicle. Return false if failed
	
	public boolean parkVehicle(Vehicle vehicle) {
		return false;	
	}
	/* Park a vehicle starting at the spot spotNumber, and
	* continuing until vehicle.spotsNeeded. */
	
	private boolean parkStartingAtSpot(int num,Vehicle v) {
		return false;
		
	}
	/* Find a spot to park this vehicle. Return index of spot, or -1
	 * on failure. */
	private int findAvailableSpots(Vehicle vehicle) {
		return availableSpots;
		
	}
	/* When a car was removed from the spot, increment
	 * availableSpots */
	public void spotFeed() {
		availableSpots++;
	}
}
