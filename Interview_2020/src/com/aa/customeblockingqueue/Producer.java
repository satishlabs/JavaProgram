package com.aa.customeblockingqueue;

public class Producer implements Runnable{
	CustomBlockingQueue<Integer> sharedQueue;
	public Producer(CustomBlockingQueue<Integer> bq) {
		this.sharedQueue = bq;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			try {
				System.out.println("Produced : "+i);
				sharedQueue.put(i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
