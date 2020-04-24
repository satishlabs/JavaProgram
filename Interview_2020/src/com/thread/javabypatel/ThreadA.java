package com.thread.javabypatel;

public class ThreadA extends Thread{
	ResourceLock lock;
	
	public ThreadA(ResourceLock lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<100;i++) {
					while(lock.flag!=1) {
						lock.wait();
					}
					System.out.print("A ");
					Thread.sleep(1000);
					lock.flag=2;
					lock.notifyAll();
				}
			}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
