package com.thread;

public class FirstThread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
	public void run(String s) {
		System.out.println("Overloaded Thread is running: "+s);
	}
	public static void main(String[] args) {
		FirstThread f1 = new FirstThread();
		f1.start();
		//f1.run();
		f1.run("Satish");
		
		FirstThread f2 = new FirstThread();
		f2.start();
		//f1.run();
		f2.run("Satish");
	}
}
