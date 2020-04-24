package com.thread.syncronization;
class Table5{
	public synchronized static void printTable(int n) {
		for(int i=1;i<10;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(400);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class TestSynchronization5 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Table5.printTable(1);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				Table5.printTable(10);
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
				Table5.printTable(100);
			}
		};
		Thread  t4 = new Thread() {
			public void run() {
				Table5.printTable(1000);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
