package com.thread.blockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQ {
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<String> dqueue = new LinkedBlockingDeque<>();
		dqueue.addFirst("1");
		dqueue.addLast("2");
			
		dqueue.put("3");
		dqueue.put("4");
	
		System.out.println("Put: "+dqueue);
		
		dqueue.take();
		dqueue.take();

		
		System.out.println("Take: "+dqueue);
		
		String two = dqueue.takeLast();
		String one = dqueue.takeFirst();
		
		System.out.println(two+" "+one);
	}
}
