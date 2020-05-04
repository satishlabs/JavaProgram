package com.heapimplementation;

public class Heap {
	private Node[] heapArray;
	private int maxSize; //size of the array
	private int currentSize; //number of nodes in the array
	
	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size]; //actually creates the array 
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	public boolean insert(int key) {
		if(currentSize == maxSize) { // array is full
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		
		trickleUp(currentSize);
		currentSize++;
		return true;
	}

	public void trickleUp(int indx) {  // idx = currentSize
		
		int parentIdx = (indx-2)/2; //find the parent node for child node
		Node nodeToInsert = heapArray[indx];
		
		//loop as long as we haven't reached the root and key of nodeToInsert parent is less than new node
		while(indx > 0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
			heapArray[indx] = heapArray[parentIdx]; //move parent down
			indx = parentIdx;
			parentIdx = (parentIdx - 1)/2;
		}
		heapArray[indx] = nodeToInsert;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		currentSize--;
		heapArray[0] = heapArray[currentSize];
		
		trickleDown(0);
		
		return root;
	}

	public void trickleDown(int indx) {
		int largerChildIndx;
		Node top = heapArray[indx]; // save last into top variable
		
		//will run as long as indx is not on the bottom row(at least one child)
		while(indx <currentSize/2) {
			int leftChildIndx = 2*indx + 1; //left child indx position
			int rightChildIndx = leftChildIndx + 1; //right child indx position
			
			//figure out which child is larger
			if(rightChildIndx < currentSize && heapArray[leftChildIndx].getKey() < heapArray[rightChildIndx].getKey()) {
				largerChildIndx = rightChildIndx;
			}else {
				largerChildIndx = leftChildIndx;
			}
			if(top.getKey() >= heapArray[largerChildIndx].getKey()) {
				//successfully made root the largest key
				break;
			}
			heapArray[indx] = heapArray[largerChildIndx];
			indx = largerChildIndx; //Go down
		}
		heapArray[indx] = top;
	}
}
 