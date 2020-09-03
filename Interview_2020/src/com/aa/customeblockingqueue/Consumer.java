package com.aa.customeblockingqueue;

public class Consumer implements Runnable{
	CustomBlockingQueue<Integer> sharedQueue;
	public Consumer(CustomBlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed: "+sharedQueue.take());
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
