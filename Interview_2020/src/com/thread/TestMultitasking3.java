package com.thread;

class S1 extends Thread{
	public void run() {
		System.out.println("Task One");
	}
}

class S2 extends Thread{
	public void run() {
		System.out.println("Task Two");
	}
}

//Program of performing two tasks by two threads
public class TestMultitasking3 {
	public static void main(String[] args) {
		S1 t1 = new S1();
		S2 t2 = new S2();
		t1.start();
		t2.start();
	}
}
