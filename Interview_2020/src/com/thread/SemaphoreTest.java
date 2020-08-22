package com.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	static Semaphore semaphore = new Semaphore(4);
	
	static class MyATMThread extends Thread{
		String name="";
		MyATMThread(String name){
			this.name = name;
		}
		public void run() {
			System.out.println(name + " : acquiring lock...");
			System.out.println(name + " : available Semaphore permits now: "
							+ semaphore.availablePermits());
			
			try {
				semaphore.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
