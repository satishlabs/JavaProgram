package com.ds.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> queue = new LinkedList<>();
	Queue<Integer> tempQueue = new LinkedList<>();
	
	public void add(int data) {
		queue.add(data);
	}
	
	public void pop() {
		if(queue.size() < 1) {
			System.out.println("Nothing in top");
			return;
		}
		while(queue.size() > 1) {
			tempQueue.add(queue.poll());
			queue = tempQueue;
			tempQueue = new LinkedList<>();
		}
	}
}
