package com.oops.interfce;

public class Emirates implements FlightService{

	@Override
	public void getAllFlights() {
		System.out.println("Do Booking in Emirates way");
	}

	@Override
	public void doBooking() {
		System.out.println("Get flights in Emirates way");
	}

}
