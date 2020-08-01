package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee(2,"Satish");
		
		List list = new ArrayList<>();
		list.add(12);
		list.add("saa");
		list.add(16.60);
		list.add(emp);
		
		//list.forEach(lst -> System.out.println(lst));
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			//list.add("Hello");  //Exception in thread "main" java.util.ConcurrentModificationException
			System.out.println(itr.next());
		}
		System.out.println("===============================");
		ListIterator listItr = list.listIterator();
		while(listItr.hasNext()) {
			//list.add("Hello");
			System.out.println(listItr.next());
		}
	}
}
