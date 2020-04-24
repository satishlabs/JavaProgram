package com.thread.threadLocale;

import java.util.Date;

public class ThreadLocalUsage {
	static class MyRunnable implements Runnable{
		private ThreadLocal<String> threadLocale = new ThreadLocal<String>();
		@Override
		public void run() {
			threadLocale.set(new Date().toString());
			try {
				Thread.sleep(4000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" start tiime = "+threadLocale.get());
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread1 = new Thread(myRunnable,"Thread-1");
		Thread thread2 = new Thread(myRunnable, "Thread-2");
		
		thread1.start();
		Thread.sleep(1000);
		thread2.start();
	}
}
