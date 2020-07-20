package com.thread.syncronization;

public class TicketTest {
	public static void main(String[] args) {
		TicketBooking obj = new TicketBooking();
		
		Thread t1 = new Thread(obj, "Passenger1 Thread");
		Thread t2 = new Thread(obj, "Passenger2 Thread");
		
		t1.start();
		t2.start();
	}
}
