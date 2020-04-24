package com.ds.queue;

public class Queue {
	private int maxSize; //initilizes  the set numbers of slots
	private long[] queArray; //slots to maintain the data
	private int front; //this will be the index position for the element in the front
	private int rear; // this is also going to be  the index position for the element at the back of the line
	private int nItems; //counter to maintain the number of items in our queue
	 
	public Queue(int size){
		this.maxSize = size;
		this.queArray = new long[size];
		front =0; //index position of the first  
		rear =-1; //there is no item in the array yet to  be considered as the last item.
		nItems =0; //We don't have elements in the array yet
		
	}
	
	public void insert(long item){
		if(rear == maxSize-1){
			rear =-1;
		}
		rear++;
		queArray[rear] = item;
		nItems++;
	}
	
	public long remove(){
		long temp = queArray[front];
		front++;
		if(front == maxSize){
			front =0; //front will back to the 0th index so that we can utilize the entire array again
		}
		nItems--;
		return temp;
	}
	
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems ==0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.print("[ ");
		for(int i=0;i<queArray.length;i++){
			System.out.print(queArray[i]+" ");
		}
		System.out.print(" ]");
	}
}
