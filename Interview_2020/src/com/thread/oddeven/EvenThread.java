package com.thread.oddeven;

public class EvenThread extends Thread{
	int limit;
	SharedPrinter printer;
	
	public EvenThread(int limit,SharedPrinter printer) {
		this.limit=limit;
		this.printer = printer;
	}
	
	public void run() {
		int evenNumber=2;
		while(evenNumber <= limit) {
			printer.printEven(evenNumber);
			evenNumber = evenNumber+2;
		}
	}
}
