package com.thread.syncronization;
class Table1{
	public synchronized void pirntTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread{
	Table1 t;
	
	public MyThread1(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.pirntTable(5);
	}
}
class MyThread2 extends Thread{
	Table1 t;

	public MyThread2(Table1 t) {
		this.t = t;
	}
	public void run() {
		t.pirntTable(100);
	}
	
}
public class TestSynchronization2 {
	public static void main(String[] args) {
		Table1 t = new Table1();
		MyThread1 t1 = new MyThread1(t);
		MyThread2 t2 = new MyThread2(t);
		t1.start();
		t2.start();
	}
}
