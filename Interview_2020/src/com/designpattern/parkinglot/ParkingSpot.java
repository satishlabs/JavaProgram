package com.designpattern.parkinglot;

public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	
	public ParkingSpot( VehicleSize spotSize, int row, int spotNumber, Level level) {
		super();
		this.spotSize = spotSize;
		this.row = row;
		this.spotNumber = spotNumber;
		this.level = level;
	}
	
	public boolean isAvailable() {
		return (vehicle == null);
	}
	
	/* Check if the spot is big enough and is available */
	public boolean canFitVehicle(Vehicle vehicle) {
		return false;
	}
	
	/* Park vehicle in this spot. */
	public boolean park(Vehicle v) {
		return false;
		
	}
	
	public int getRow() {
		return row;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	
	/* Remove vehicle from spot, and notify level that a new spot is
	* available */
	
	public void removeVehicle() {
		
	}
}
