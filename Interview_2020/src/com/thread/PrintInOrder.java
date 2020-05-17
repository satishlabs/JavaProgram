package com.thread;

public class PrintInOrder implements Runnable{
	private int valueToPrint;
	private int id;
	private static int turn = 1;
	private static int REST_TURN_THRESHHOLD = 3;
	
	public PrintInOrder() {
		this.valueToPrint = -1;
	}
	
	public PrintInOrder(int id,int val) {
		this.id = id;
		this.valueToPrint = val;
	}
	@Override
	public void run() {
		while(true) {
			if(turn == this.id) {
				System.out.println(Thread.currentThread().getName()+" ::: "+valueToPrint);
				turn++;
			}
			if(turn > REST_TURN_THRESHHOLD) {
				turn = 1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintInOrder(1, 1));
		t1.setName("Thread-1");
		t1.start();
		
		Thread t2 = new Thread(new PrintInOrder(2, 2));
		t2.setName("Thread-2");
		t2.start();
		
		Thread t3 = new Thread(new PrintInOrder(3, 3));
		t3.setName("Thread-3");
		t3.start();
	}
}
