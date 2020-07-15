package com.collection.list.copyonwritelist;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClientTest {
	public static void main(String[] args) {
		//List<Integer> list = new ArrayList<>();
		List<Integer> list = new CopyOnWriteArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Integer n = (Integer) itr.next();
			System.out.println(n);
			if(n==5)
				//itr.remove();
				list.remove(4);//Exception in thread "main" java.util.ConcurrentModificationException with list
		}
		System.out.println("-----------------------------------");
		System.out.println(list);
	}
}
