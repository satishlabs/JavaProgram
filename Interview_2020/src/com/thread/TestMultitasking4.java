package com.thread;

public class TestMultitasking4 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Task One");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Task Two");
			}
		};
		
		t1.start();
		t2.start();
	}
}
