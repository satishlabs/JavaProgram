package com.thread.semaphore.scenarios2;

import java.util.concurrent.Semaphore;

public class ConsumerProducer {
	public static void main(String[] args) {
		Semaphore semaphoreProducer = new Semaphore(1);
		Semaphore semaphoreConsumer = new Semaphore(0);
		
		System.out.println("semaphoreProdcuer permits = 1 | semaphoreConsumer permits = 0");
		Producer producer = new Producer(semaphoreProducer, semaphoreConsumer);
		Consumer consumer = new Consumer(semaphoreConsumer, semaphoreProducer);
		
		Thread prodcuerThread = new Thread(producer, "ProdcuerThread");
		Thread consumerThread = new Thread(consumer, "consumerThread");
		
		prodcuerThread.start();
		consumerThread.start();
	}
}
