package com.thread.multithreadingdemo2;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+"i = "+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
