 package com.aa.customeClassImplementationArrayList;

import java.util.Arrays;

public class ArrayListCustom<E> {
	private static final int INITIAL_CAPACITY = 10;
	private Object elementData[] = {};
	private int size =0;
	
	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}
	public void add(E e) {
		if(size == elementData.length) {
			// increase current capacity of list, make it double.
			ensureCapacity();
		}
		elementData[size++] = e;
	}
	private void ensureCapacity() {
		int newIncreaseCapacity = elementData.length*2;
		elementData = Arrays.copyOf(elementData, newIncreaseCapacity);
		
	}
	public void display() {
		 System.out.print("Displaying list : ");
		for(int i=0; i<size; i++) {
			System.out.println(elementData[i]+" ");
		}
		
	}
	public E get(int index) {
		 // if index is negative or greater than size of size, we throw
        // Exception.
		if(index <  0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size "+ index);
		}
		return (E)elementData[index];// return value on index.
	}
	public Object remove(int index) {
		 // if index is negative or greater than size of size, we throw
        // Exception.
		if(index <  0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size "+ index);
		}
		Object removedElement = elementData[index];
		for(int i =0; i<size-1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;// reduce size of ArrayListCustom after removal of element.
		return removedElement;
	}

}
