package com.thread;
class MyThread3 extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}
	}
}

public class ThreadLifeCycle1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 t = new MyThread3();
		t.start();
		t.interrupt();
		System.out.println("Interrupted state after calling interrupt(): "+t.isInterrupted());
		
		Thread.sleep(1000);
		System.out.println("Interrupted state in 1 second: "+t.isInterrupted());
	}
}
