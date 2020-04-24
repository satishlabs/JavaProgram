package com.thread;

public class ThreadDemo extends Thread{
	public void run() {
			System.out.println("ThreadDemo Test running...");
			System.out.println(null+"satish");
	}
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread t1 = new Thread(td);
		
		//t1.start();
		t1.run();
	}
}
