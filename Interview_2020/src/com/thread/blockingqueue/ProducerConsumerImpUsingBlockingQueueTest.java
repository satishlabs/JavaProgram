package com.thread.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerImpUsingBlockingQueueTest {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) {
		Thread producerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					producer();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				try {
					consumer();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected static void producer() throws InterruptedException {
		while(true) {
			Thread.sleep(2000);
			Integer consumed = queue.take();
			System.out.println("Consumed: "+consumed);
		}
	}

	protected static void consumer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Thread.sleep(20000);
			int produced = random.nextInt(100);
			queue.put(produced);
			System.out.println("Produced: "+produced);
		}
	}
	
}
