package com.thread;

public class MyClass2 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: "+t.getName());
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended: "+t.getName());
	}
}
