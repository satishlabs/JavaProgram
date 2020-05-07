package com.thread.sequenceThread;

public class ThreadC extends Thread{
	ResourceLock lock;
	
	public ThreadC(ResourceLock lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<5;i++) {
					while(lock.flag != 3) {
						lock.wait();
					}
					System.out.println("C");
					Thread.sleep(1000);
					lock.flag = 1;
					lock.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 3: "+e.getMessage());
		}
	}
}
