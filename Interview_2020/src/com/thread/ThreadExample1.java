package com.thread;
class MyThread1 extends Thread{
	public void run() {
		System.out.println("My Thread with Id: ||"+Thread.currentThread().getId()+" || is running!");
	}
}

public class ThreadExample1 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			MyThread1 t = new MyThread1();
			//t.start();
			t.run();
		}
	}
}
