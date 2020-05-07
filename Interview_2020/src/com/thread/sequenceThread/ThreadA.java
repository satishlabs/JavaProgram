package com.thread.sequenceThread;

public class ThreadA extends Thread{
   ResourceLock lock;
   
   public ThreadA(ResourceLock lock) {
	   this.lock = lock;
   }
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				for(int i=0;i<5;i++) {
					while(lock.flag != 1) {
						lock.wait();
					}
					System.out.println("A");
					Thread.sleep(1000);
					lock.flag = 2;
					lock.notifyAll();
				}
			}
		}catch (Exception e) {
			System.out.println("Exception 1: "+e.getMessage());
		}
	}
}
