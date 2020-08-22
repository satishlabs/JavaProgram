package com.thread.reentrant;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {
	private final Lock queueLock = new ReentrantLock();
	
	public void printJob(Object doument) {
		queueLock.lock();
		try {
			Long duration = (long) (Math.random()*1000);
			System.out.println(Thread.currentThread().getName() +": PrintQueue: Printing a Job during "+(duration/1000)+" seconds :: Time - "+new Date());
			Thread.sleep(duration);
		}catch (InterruptedException  e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("%s: The document has been printed \n, "+ Thread.currentThread().getName());
			queueLock.unlock();
		}
	}
}
