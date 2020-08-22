package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteLockTest {
	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyWriteRunnable myWriteRunnable = new MyWriteRunnable(readWriteLock);
		
		new Thread(myWriteRunnable, "Thread-1").start();
		new Thread(myWriteRunnable, "Thread-2").start();
	}
}
/*
Thread-1 has acquired write lock.
Thread-1 has released write lock.
Thread-1 acquired and released writeLock, thread-2 was waiting to acquire writeLock.

Thread-2 has acquired write lock.
Thread-2 has released write lock.
Thread-2 was able to acquire writeLock only when it was released by Thread-1.
 */