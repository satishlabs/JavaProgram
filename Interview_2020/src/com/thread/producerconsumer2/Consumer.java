package com.thread.producerconsumer2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("Consumed :"+sharedQueue.take());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
