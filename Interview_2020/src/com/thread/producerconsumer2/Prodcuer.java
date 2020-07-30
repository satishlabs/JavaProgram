package com.thread.producerconsumer2;

import java.util.concurrent.BlockingQueue;

public class Prodcuer implements Runnable{
	BlockingQueue<Integer> sharedQueue;
	
	public Prodcuer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			try {
				System.out.println("Produced :"+i);
				sharedQueue.put(i);
			}catch (InterruptedException e) {
				System.out.println(e.toString());
			}
		}
		
	}

}
