package com.thread.multithreadingdemo3;
//Can we start a thread twice or can we restart a dead  thread
public class TestClient {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r, "T1");
		t1.start();
		
		t1.start();
	}
}
