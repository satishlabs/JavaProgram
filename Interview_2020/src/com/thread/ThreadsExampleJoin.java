package com.thread;

public class ThreadsExampleJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		
		t1.start();
		t1.join();
		t2.start();
	}
}
