package com.aa.customeImplementationVector;

import java.util.Arrays;

public class VectorCustom<E> {
	private static final int INITIAL_CAPACITY = 10;
	private Object elementData[] = {};
	private int size = 0;
	
	public VectorCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}
	
	public synchronized void add(E e) {
		if(size == elementData.length) {
			ensureCapacity();//increase current capacity of list, make it double.
		}
		elementData[size++] = e;
	}

	private void ensureCapacity() {
		int increaseCapacity = elementData.length*2;
		elementData = Arrays.copyOf(elementData, increaseCapacity);
	}

	public void display() {
		System.out.println("Displaying list :");
		for(int i=0;i<size;i++) {
			System.out.println(elementData[i]+" ");
		}
		
	}

	public synchronized E get(int index) {
		  //if index is negative or greater than size of size, we throw Exception.
		if ( index <0 || index>= size) {  
		      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		    }
		    return (E) elementData[index]; //return value on index.
	}
	  /**
	   * method returns removedElement on specific index.
	   * else it throws IndexOutOfBoundException if index is negative or greater than size of size.
	   */
	public synchronized E remove(int index) {
		 //if index is negative or greater than size of size, we throw Exception.
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index "+index+" , Size "+index);
		}
		Object removedElement = elementData[index];
		for(int i=0; i<size-1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
		return (E) removedElement;
	}
}
