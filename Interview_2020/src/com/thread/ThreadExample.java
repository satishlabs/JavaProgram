package com.thread;

public class ThreadExample {
	public static void main(String[] args) {
		System.out.println("The main thread is: "+Thread.currentThread().getName());
		MyThread t = new MyThread();
	//	t.start();
		t.run();
	}
}
