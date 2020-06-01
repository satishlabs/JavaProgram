package com.thread;

public class TestMultitasking2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Task One");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new TestMultitasking2());
		Thread t2 = new Thread(new TestMultitasking2());
		Thread t3 = new Thread(new TestMultitasking2());
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
