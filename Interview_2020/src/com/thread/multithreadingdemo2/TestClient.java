package com.thread.multithreadingdemo2;

public class TestClient {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		Thread thread1 = new Thread(r, "T1");
		Thread thread2 = new Thread(r, "T2");
		
		thread1.start();
		thread2.start();
	}
}
