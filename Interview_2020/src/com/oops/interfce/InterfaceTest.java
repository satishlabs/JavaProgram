package com.oops.interfce;
/*
 Lets say we want to start a service like "makemytrip.com" or "expedia.com",  where we are responsible for displaying the flights from various
  flight service company and place an order from customer. 
Lets keep our service as simple as, 

    Displaying flights available from vendors like "AirIndia", "Emirates" and "JetAirways".
    Place and order for seat to respective vendor.

Remember, In this application, we don't own any flight. we are just a middle man/aggregator.
Lets see how to design it.
  */


public class InterfaceTest {
	private static FlightManager flightManager = new FlightManager();
	
	public static void main(String[] args) {
		loadVendors();
		
		System.out.println("Get All filghts...");
		for(FlightService fs : flightManager.getListVendors()) {
			fs.getAllFlights();
		}
		
		System.out.println("Do Booking...");
		for(FlightService fs : flightManager.getListVendors()) {
			fs.doBooking();
		}
	}

	private static void loadVendors() {
		flightManager.addVender(new Emirates());
		flightManager.addVender(new JetAirways());
		flightManager.addVender(new AirIndia());
	}
	
	
}
