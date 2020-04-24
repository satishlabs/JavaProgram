package com.thread.syncronization;
class Table4{
	public synchronized static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread41 extends Thread{
	public void run() {
		Table4.printTable(1);
	}
}
class MyThread42 extends Thread{
	public void run() {
		Table4.printTable(10);
	}
}
class MyThread43 extends Thread{
	public void run() {
		Table4.printTable(100);
	}
}
class MyThread44 extends Thread{
	public void run() {
		Table4.printTable(1000);
	}
}
public class TestSynchronization4 {
	public static void main(String[] args) {
		Table4 t = new Table4();
		MyThread41 t1 = new MyThread41(); 
		MyThread42 t2 = new MyThread42(); 
		MyThread43 t3 = new MyThread43(); 
		MyThread44 t4 = new MyThread44();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
