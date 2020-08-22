package com.thread;
class MyThread2 extends Thread{
	public void run() {
		//System.out.println("In thread state is: "+Thread.currentThread().getState());
		try {
			Thread.sleep(1500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 t = new MyThread2();
		System.out.println("After new thread instance creatation: "+t.getState());
		
		t.start();
		System.out.println("After calling the start(): "+t.getState());
		
		Thread.sleep(1000);
		System.out.println("We sent our thread to sleep state: "+t.getState());
		
		Thread.sleep(1000);
		System.out.println("Thread is finished: "+t.getState());
	}
}
