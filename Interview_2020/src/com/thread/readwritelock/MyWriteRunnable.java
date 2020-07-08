package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class MyWriteRunnable implements Runnable{
	ReadWriteLock readWriteLock;
	public MyWriteRunnable(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}
	
	@Override
	public void run() {
		  /*
         * Only one threads can acquire writeLock at a time. Means writeLock
         * can only be obtained if no other thread is acquiring read or
         * write lock at that time.
         */
		readWriteLock.writeLock().lock();
		System.out.println(Thread.currentThread().getName()+" has acquired write lock");
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has released write lock");
		readWriteLock.writeLock().unlock();
	}

}
