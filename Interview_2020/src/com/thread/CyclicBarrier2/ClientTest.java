package com.thread.CyclicBarrier2;

import java.util.concurrent.CyclicBarrier;

public class ClientTest {
	public static void main(String[] args) {
		
		CyclicBarrier barrier = new CyclicBarrier(2);
		
		System.out.println(Thread.currentThread().getName()+" has started..");
		
		PassengerThread p1 = new PassengerThread(1000, barrier, "Satish");
		PassengerThread p2 = new PassengerThread(2000, barrier, "MsDhoni");
		PassengerThread p3 = new PassengerThread(3000, barrier, "Virat");
		PassengerThread p4 = new PassengerThread(4000, barrier, "Rohit");
		
		PassengerThread p5 = new PassengerThread(5000, barrier, "Bumrah");
		PassengerThread p6 = new PassengerThread(6000, barrier, "Sachin");
		PassengerThread p7 = new PassengerThread(7000, barrier, "KLRahul");
		PassengerThread p8 = new PassengerThread(8000, barrier, "Sikhar");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName()+" has finished..");
	}
	
}
