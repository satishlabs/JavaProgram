package com.thread.reentrant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class WorkerTest {
	static final int MAX_T = 2;
	public static void main(String[] args) {
		ReentrantLock rel = new ReentrantLock();
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		Runnable r1 = new Worker(rel, "Job1");
		Runnable r2 = new Worker(rel, "Job2");
		Runnable r3 = new Worker(rel, "Job3");
		Runnable r4 = new Worker(rel, "Job4");
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		
		pool.shutdown();
	}
}
