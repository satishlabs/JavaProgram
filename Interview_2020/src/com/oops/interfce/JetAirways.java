package com.oops.interfce;

public class JetAirways implements FlightService{

	@Override
	public void getAllFlights() {
		System.out.println("Do booking in JetAirways way");
	}

	@Override
	public void doBooking() {
		System.out.println("Get flights in JetAirways way");
	}

}
