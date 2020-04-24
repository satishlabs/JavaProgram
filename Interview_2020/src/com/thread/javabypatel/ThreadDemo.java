package com.thread.javabypatel;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new RuntimeException("Thread Exceptoin example");
				
			}
		});
		t.start();
		
		while(true) {
			System.err.println("Main");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
