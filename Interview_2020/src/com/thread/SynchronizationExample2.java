package com.thread;

/*
 What is the output of below program? Will synchronized block will be executed 
 in synchronized way as hello() method is executed on different object?
 */

public class SynchronizationExample2 {
	private static Object obj = new Object();
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				SynchronizationExample2 synch1 = new SynchronizationExample2();
				synch1.hello();
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				SynchronizationExample2 synch2 = new SynchronizationExample2();
				synch2.hello();
			}
		}).start();
	}

	protected void hello() {
		synchronized (obj) {
			System.out.println("Thread: "+Thread.currentThread().getName()+" Inside");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: "+Thread.currentThread().getName()+" Leaving");
		}
		
	}
}
