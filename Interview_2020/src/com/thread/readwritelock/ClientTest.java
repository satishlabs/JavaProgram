package com.thread.readwritelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = null;
		try {
		es = Executors.newFixedThreadPool(3);
		final Counter counter = new Counter();
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" writring on count vaiable..");
				for(int i=1; i<=5000; i++) {
					counter.increment();
				}
			}
		};
		
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" getting value of count vaiable...");
				int finalCount = counter.getCount();
				System.out.println("Final Count: "+finalCount);
			}
		};
		Runnable task3 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" getting value of count vaiable...");
				int finalCount = counter.getCount();
				System.out.println("Final Count: "+finalCount);
			}
		};
		es.submit(task1);
		es.awaitTermination(3, TimeUnit.SECONDS);
		es.submit(task2);
		es.submit(task3);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if(es != null)
				es.shutdown();
		}
	}
}
