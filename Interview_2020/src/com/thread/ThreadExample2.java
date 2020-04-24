package com.thread;

class MyThread4 implements Runnable{

	@Override
	public void run() {
		System.out.println("We crearted the thread wuth name: "+Thread.currentThread().getName());
	}
	
}

public class ThreadExample2 {
	public static void main(String[] args) {
		System.out.println("The Main Thread is: "+Thread.currentThread().getName());
		Thread t = new Thread(new MyThread4());
		t.start();
	}
}
