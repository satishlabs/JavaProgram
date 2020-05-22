package com.company.arisglobal;

public class Mett1 {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.run();
		t.start();
		
		System.out.println("Main Thread");
	}
}

class MyThread extends Thread{
	
}
