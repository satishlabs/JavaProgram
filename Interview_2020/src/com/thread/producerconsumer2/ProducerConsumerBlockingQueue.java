package com.thread.producerconsumer2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class ProducerConsumerBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		
		Prodcuer producer = new Prodcuer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer, "Producer Thread");
		Thread consumerThread = new Thread(consumer, "Consumer Thread");
		
		producerThread.start();
		consumerThread.start();
		
	}
}
