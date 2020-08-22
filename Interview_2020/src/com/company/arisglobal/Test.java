package com.company.arisglobal;

public class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		Thread th = new Thread(test);
		th.start();
	}
}
