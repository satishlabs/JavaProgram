package com.oops.interfce;

public class AirIndia implements FlightService{

	@Override
	public void getAllFlights() {
		System.out.println("Do booking in AirIndia way");
	}

	@Override
	public void doBooking() {
		System.out.println("Get flights in AirIndia way");
	}

}
