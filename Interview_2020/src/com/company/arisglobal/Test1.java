package com.company.arisglobal;

class Example extends Thread{
	
}


public class Test1 {
	private int count = 1;
	public synchronized void doSomething() {
		for(int i=0; i<10; i++) {
			System.out.println(count++);
		}
	}
	
	public static void main(String[] args) {
		Test1 demo = new Test1();
		Thread t1 = new Example(demo);
		Thread t2 = new Example(demo);
		
		t1.start();
		t2.start();
	}
}
