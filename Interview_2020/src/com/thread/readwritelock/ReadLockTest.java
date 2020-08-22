package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockTest {
	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyRunnable myRunnable = new MyRunnable(readWriteLock);
		
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();
	}
}
/*
 Output:
 
Thread-1 has acquired read lock.
Thread-2 has acquired read lock.
Thread-1 and Thread-2 were able to acquire readLock at same time.

Thread-1 has released read lock.
Thread-2 has released read lock.
 */