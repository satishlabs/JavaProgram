package com.thread.oddeventhread;

public class PrintEvenOddTester {
	public static void main(String[] args) {
		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(10, print, false));
	    Thread t2 = new Thread(new TaskEvenOdd(10, print, true));
		t1.start();
		t2.start();
	}
}
