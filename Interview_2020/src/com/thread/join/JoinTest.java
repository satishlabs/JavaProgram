package com.thread.join;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		
		// thread t1 starts 
		t1.start();
		try {
			System.out.println("Current Thread: "+Thread.currentThread().getName());
			t1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			System.out.println("Current Thread: "+Thread.currentThread().getName());
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		t3.start();
	}
}
