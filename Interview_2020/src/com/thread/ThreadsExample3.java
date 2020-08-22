package com.thread;
class MyThread5 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The thread "+Thread.currentThread().getName()+" is running");
		}
		
	}
}

public class ThreadsExample3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		
		t1.start();
		t2.start();
	}
}
