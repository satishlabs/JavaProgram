package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class MyRunnable implements Runnable{
	ReadWriteLock readWriteLock;
	
	 public MyRunnable(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}
	
	@Override
	public void run() {
		readWriteLock.readLock().lock();
		System.out.println(Thread.currentThread().getName()+" has acquired read lock.");
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has released read lock");
		readWriteLock.readLock().unlock();
	}

}
