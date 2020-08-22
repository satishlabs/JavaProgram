package com.thread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) throws InterruptedException {
		// define capacity of ArrayBlockingQueue 
		int capacity = 5;
		

        // create object of ArrayBlockingQueue 
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);
		
		// Add elements to ArrayBlockingQueue using put method 
		queue.put("Satish");
		queue.put("Test");
		queue.put("Flash");
		queue.put("List");
		queue.put("ANC");
		
		System.out.println("Queue Contains: "+queue);
		
		queue.remove();
		System.out.println("Queue Contains: "+queue);
		
		queue.remove();
		System.out.println("Queue Contains: "+queue);
		
		queue.put("Hello");
		System.out.println("Queue Contains: "+queue);
		
		queue.remove();
		System.out.println("Queue Contains: "+queue);
	}
}
