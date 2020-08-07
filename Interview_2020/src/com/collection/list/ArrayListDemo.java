package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//creating an ArrayList
		ArrayList<String> names = new ArrayList<>();
		names.add("Ms");
		names.add("Virat");
		names.add("Rohit");
		names.add("Sachin");
		
		//int newCapacity = oldCapacity + (oldCapacity >> 1); //java 7
		//int newCapacity = (oldCapacity *3)/2 + 1; //java 6
		
		new Thread() {
			public void run() {
				//fetch the elements from list object
				Iterator<String> collectionOfNames = names.iterator();
				while(collectionOfNames.hasNext()) {
					String tempName = collectionOfNames.next();
					System.out.println(tempName);
				}
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				//adding an element to the middle of the list
				System.out.println("Adding done to the list");
				names.add(1,"Satish");
			}
		}.start();
	}
}
