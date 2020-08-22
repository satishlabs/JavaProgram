package com.program;

import java.util.Stack;

public class SortStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(4);
		stack.push(2);
		stack.push(2);
		stack.push(-1);
		stack.push(100);
		stack.push(0);
		
		System.out.println(stack.size());
		sort(stack);
		System.out.println(stack);
	}

	public static void sort(Stack stack) {
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		while(stack.size()!=0) {
			if(stack.size()%2==0) {
				s1.push(stack.pop());
			}else {
				s2.push(stack.pop());
			}
		}
		if(s1.size()>1) {
			sort(s1);
		}
		if(s2.size()>1) {
			sort(s2);
		}
		//System.out.println("S1 "+s1);
		//System.out.println("S2 "+s2);
		merge(s1,s2,stack);
	}

	public static void merge(Stack s1, Stack s2, Stack stack) {
		 Stack mergedStack = new Stack();
	        while (!s1.isEmpty() && !s2.isEmpty()) {
	            if ((Integer) s1.peek() < (Integer) s2.peek()) {
	                mergedStack.push(s2.pop());
	            } else {
	                mergedStack.push(s1.pop());
	            }
	        }
	 
	        while (!s1.isEmpty()) {
	            mergedStack.push(s1.pop());
	        }
	 
	        while (!s2.isEmpty()) {
	            mergedStack.push(s2.pop());
	        }
	 
	        while (!mergedStack.isEmpty()) {
	            stack.push(mergedStack.pop());
	        }
	    }
		
	
}
