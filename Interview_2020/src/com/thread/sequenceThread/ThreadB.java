package com.thread.sequenceThread;

public class ThreadB extends Thread{
	ResourceLock lock;
	public ThreadB(ResourceLock lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<5;i++) {
					while(lock.flag != 2) {
						lock.wait();
					}
					System.out.println("B");
					Thread.sleep(1000);
					lock.flag = 3;
					lock.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 2: "+e.getMessage());
		}
	}
}
