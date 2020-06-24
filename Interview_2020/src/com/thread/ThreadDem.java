package com.thread;

public class ThreadDem {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside run....");
			}
		});
		
		thread1.start();
		//thread1.start();
	}
}
