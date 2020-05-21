package com.ds.stack;

public class QueueUsingStackApp {
	public static void main(String[] args) {
		QueueUsingSingleStack queueUsingStack  = new QueueUsingSingleStack();
		
		queueUsingStack.enQueue(10);
		queueUsingStack.enQueue(20);
		queueUsingStack.enQueue(30);
		queueUsingStack.enQueue(40);
		
		queueUsingStack.deQueue();
		queueUsingStack.deQueue();

	}

}
