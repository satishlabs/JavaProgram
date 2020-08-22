package com.thread;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new RuntimeException("Runtime");
			}
		});
		t1.start();
		
		System.out.println(" After runtime");
		
	}
}
