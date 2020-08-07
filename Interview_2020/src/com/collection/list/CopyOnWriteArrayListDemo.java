package com.collection.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
		//adding element to the list
		
		names.add("Sachin");
		names.add("Dhoni");
		names.add("Virat");
		names.add("Rohit");
		
		new Thread() {
			public void run() {
				Iterator<String> collectionOfName = names.iterator();
				while(collectionOfName.hasNext()) {
					System.out.println(collectionOfName.next());
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println("adding the elements to the middle of the list");
				names.add(1, "Kohli");
			}
		}.start();
		
	}
}
