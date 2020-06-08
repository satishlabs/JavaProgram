package com.thread.blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerBQ implements Runnable{
	private final BlockingQueue sharedQ;
	
	 public ProducerBQ(BlockingQueue sharedQ) {
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Random random = new Random();
				int number = random.nextInt(5);
				System.out.println("Producing value: "+number);
				sharedQ.put(number);
			}catch (InterruptedException e) {
				System.out.println("Error :: "+e);
			}
		}
	}

}
