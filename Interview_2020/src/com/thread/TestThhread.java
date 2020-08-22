package com.thread;

public class TestThhread {
	static synchronized void m1() {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	 synchronized void m2() {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		final TestThhread t = new TestThhread();
		
		Thread t1 = new Thread() {
			public void run() {
				TestThhread.m1();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				t.m2();
			}
		};
		
		t1.start();
		Thread.sleep(1000);
		
		t2.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
		System.out.println(t2.getState());
	}
}
