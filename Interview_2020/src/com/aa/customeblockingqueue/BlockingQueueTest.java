package com.aa.customeblockingqueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		CustomBlockingQueue<Integer> bq = new CustomBlockingQueueTest<Integer>(3);
		
		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);
		
		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");
		
		producerThread.start();
		consumerThread.start();
	}
}
