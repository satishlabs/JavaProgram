package com.aa.customeblockingqueue;

import java.util.LinkedList;
import java.util.List;

public class CustomBlockingQueueTest<E> implements CustomBlockingQueue<E> {
	 List<E> queue;
	 int maxSize;
	 
	 public CustomBlockingQueueTest(int maxSize) {
		 this.maxSize = maxSize;
		 queue = new LinkedList<>();
	 }
	 
	@Override
	public synchronized void put(E item) throws InterruptedException {
		if(queue.size() == maxSize) {
			this.wait();
		}
		queue.add(item);
		this.notify();
	}

	@Override
	public synchronized E take() throws InterruptedException {
		if(queue.size() == 0) {
			this.wait();
		}
		this.notify();
		return queue.remove(0);
	}

}
