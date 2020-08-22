package com.comapny.hcl;

public class Test1 {
	public static void main(String[] args) {
		Thread t = new MyThread();
		
		t.run();
		t.start();
		System.out.println("Main Thread");
	}
}
