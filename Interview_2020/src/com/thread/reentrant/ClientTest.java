package com.thread.reentrant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientTest {
	public static void main(String[] args) {
		ExecutorService es = null;
		try {
			es = Executors.newFixedThreadPool(2);
			Counter counter = new Counter();
			
			Runnable task1 = new Runnable() {
				@Override
				public void run() {
					for(int i=1;i<=10;i++) {
					counter.getCount();
					}
				}
			};
			
			Runnable task2 = new Runnable() {
				@Override
				public void run() {
					for(int i=1;i<=20;i++) {
						counter.getCount();
						}
				}
			};
			
			es.submit(task1);
			es.submit(task2);
			es.awaitTermination(5, TimeUnit.SECONDS);
			System.out.println(counter.getCount());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(es != null) {
				es.shutdown();
			}
		}
	}
}
