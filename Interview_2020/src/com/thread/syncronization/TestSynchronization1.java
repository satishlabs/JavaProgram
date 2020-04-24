package com.thread.syncronization;
class Table{
	public void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread{
	Table table1;
	public Thread1(Table t) {
		this.table1 =t;
	}
	public void run() {
		table1.printTable(5);
	}
}

class Thread2 extends Thread{
	Table table2;
	public Thread2(Table t) {
		this.table2 = t;
	}
	public void run() {
		table2.printTable(100);
	}
}
public class TestSynchronization1 {
	public static void main(String[] args) {
	Table table = new Table();
	Thread1 t1 = new Thread1(table);
	Thread2 t2 = new Thread2(table);
	t1.start();
	t2.start();
	}
}
