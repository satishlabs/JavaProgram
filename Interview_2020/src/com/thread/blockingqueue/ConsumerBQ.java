package com.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerBQ implements Runnable{
	private final BlockingQueue sharedQ;
	
	public ConsumerBQ(BlockingQueue sharedQ) {
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed Value: "+sharedQ.take());
			}catch (InterruptedException e) {
				System.out.println("Error :: "+e);
			}
		}
	}

}
