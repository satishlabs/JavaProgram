package com.ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top =-1;
	}
	
	public void push(int data){
		if(isFull()){
			System.out.println("This stack is already full!!");
		}{
		top++;
		stackArray[top] = data;
		}
	}
	
	public long pop(){
		if(isEmpty()){
			System.out.println("This stack is alrady empty!!");
			return -1;
		}{
		int old_top = top;
		top--;
		return stackArray[old_top];
		}
	}
	// Utility function to check if the stack is empty or not
	public boolean isEmpty(){
		return (top==-1);
	}
	
	// Utility function to check if the stack is full or not
	public boolean isFull(){
		return (maxSize-1 == top);
	}
}
