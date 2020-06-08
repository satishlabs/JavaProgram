package com.thread.blockingqueue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	private List queue = new LinkedList();
	private int limit = 10;
	
	public BlockingQueue(int limit) {
		this.limit = limit;
	}
	
	public synchronized void enqueue(Object itme) {
		while(this.queue.size() == this.limit) {
			try {
				wait();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			this.queue.add(itme);
			if(this.queue.size() == 1) {
				notifyAll();
			}
		}
		
	}
	
	public synchronized Object dequeue(Object item) {
		while(this.queue.size() == 0) {
			try {
				wait();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			if(this.queue.size() == this.limit) {
				notifyAll();
			}
			
		}
		return this.queue.remove(0);
	}
}
