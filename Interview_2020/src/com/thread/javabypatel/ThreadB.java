package com.thread.javabypatel;

public class ThreadB extends Thread{
	ResourceLock lock = new ResourceLock();
	
	
	public ThreadB(ResourceLock lock) {
		this.lock = lock;
	}


	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<100;i++) {
					while(lock.flag!=2) {
						lock.wait();
					}
					System.out.print("B ");
					Thread.sleep(1000);
					lock.flag=3;
					lock.notifyAll();
				}
			}
		}catch (InterruptedException  e) {
			System.out.println(e.getMessage());
		}
	}
}
