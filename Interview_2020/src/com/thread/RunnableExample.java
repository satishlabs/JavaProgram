package com.thread;

class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("The thread created by implementation of the Runnable interface: ");
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		MyRunnableThread mt = new MyRunnableThread();
		 Thread t = new Thread(mt);
		 t.start();
	}
	
}
