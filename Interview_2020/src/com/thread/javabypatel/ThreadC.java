package com.thread.javabypatel;

public class ThreadC extends Thread{
	ResourceLock lock = new ResourceLock();
	
	public ThreadC(ResourceLock lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<100;i++) {
					while(lock.flag!=3) {
						lock.wait();
					}
					System.out.print("C ");
					Thread.sleep(1000);
					lock.flag=1;
					lock.notifyAll();
				}
			}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
