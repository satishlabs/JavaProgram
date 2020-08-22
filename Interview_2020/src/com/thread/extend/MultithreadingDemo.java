package com.thread.extend;

public class MultithreadingDemo extends Thread{
	@Override
	public void run() {
		System.out.println("My Thread is running state. "+Thread.currentThread().getState());
	}
	
	public static void main(String[] args) {
		MultithreadingDemo obj = new MultithreadingDemo();
		obj.start();
	}
}
