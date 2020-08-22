package com.oops.itreator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class IterateList {
	public static void main(String[] args) {
		//Create an ArrayList object
		List<String> instanceofjavaList = new ArrayList<>();

		instanceofjavaList.add("Satish");
		instanceofjavaList.add("MsDhoni");
		instanceofjavaList.add("Virat");
		instanceofjavaList.add("Yuvraj");
		instanceofjavaList.add("Sachin");
		instanceofjavaList.add("Rohit");

		//Basic Java example program to iterate arraylist elements using list iterator
		System.out.println("==========================================");
		for(int i=0;i<instanceofjavaList.size();i++) {
			System.out.println(instanceofjavaList.get(i));
		}

		//Iterate list using Enhanced For loop
		System.out.println("==========================================");
		for(String str: instanceofjavaList) {
			System.out.println(str);
		}
		//Iterate list using while loop
		System.out.println("==========================================");
		int i=0;
		while(i<instanceofjavaList.size()) {
			System.out.println(instanceofjavaList.get(i));
			i++;
		}

		//Iterate list using iterator
		System.out.println("==========================================");
		Iterator<String> itr = instanceofjavaList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//Using List erator:
		System.out.println("==========================================");
		ListIterator<String> listItr = instanceofjavaList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		//Iterate list using Stream API.
		System.out.println("==========================================");
		instanceofjavaList.forEach(list->System.out.println(list));


	}
}
