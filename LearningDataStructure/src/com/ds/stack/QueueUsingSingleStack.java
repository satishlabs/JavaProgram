package com.ds.stack;

import java.util.Stack;

public class QueueUsingSingleStack {
	Stack<Integer> stack = new Stack<>();
	
	public void enQueue(int data) {
		stack.add(data);
	}
	
	public void deQueue() {
		if(stack.size() < 1) {
			System.out.println("Nothing in Queue");
			return;
		}
		
		if(stack.size() == 1) {
			System.out.println(stack.pop());
			return;
		}
		int data = stack.pop();
		deQueue();
		stack.push(data);
	}
}
