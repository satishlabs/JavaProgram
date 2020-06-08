package com.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class ProducerConsumerBQTest {
	public static void main(String[] args) {
		BlockingQueue sharedQ = new LinkedBlockingQueue<>();
		
		Thread producerThread = new Thread(new ProducerBQ(sharedQ),"PRODUCER");
		Thread consuerThread = new Thread(new ConsumerBQ(sharedQ),"CONSUMER");
		
		consuerThread.start();
		producerThread.start();
	}
}
