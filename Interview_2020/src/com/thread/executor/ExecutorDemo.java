package com.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread - "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class ExecutorDemo {	
	public static void main(String[] args) {
        // creating executor with pool of 2 threads
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
        // running 6 tasks
		ex.execute(new Task());
		ex.execute(new Task());
		ex.execute(new Task());
		ex.execute(new Task());
		ex.execute(new Task());
		ex.execute(new Task());
		
        // shutting down the executor service
		ex.shutdown();
		
	}
}
