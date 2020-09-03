package com.aa.customeblockingqueue;

public interface CustomBlockingQueue<E> {
	public void put(E item) throws InterruptedException;
	
	E take() throws InterruptedException;
}
