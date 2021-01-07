package com.thread;

public class OverloadingTest {
	public static synchronized void method1() {
		System.out.println("Method1");
	}
	public synchronized void method2() {
		System.out.println("Method2");
	}
	
	public static void main(String[] args) {
		OverloadingTest test = new OverloadingTest();
		Thread t1 = new Thread() {
			public void run() {
				try {
					test.method1();
					Thread.sleep(20000);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					test.method2();
					Thread.sleep(20000);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
