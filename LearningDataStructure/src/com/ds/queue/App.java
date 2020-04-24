package com.ds.queue;

public class App {
	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(300);
		myQueue.insert(15);
		myQueue.insert(21);
		myQueue.insert(150);
		//myQueue.insert(151);
		//myQueue.insert(161);
		
		myQueue.view();
	}
}
