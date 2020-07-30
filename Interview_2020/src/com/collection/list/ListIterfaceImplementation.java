package com.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterfaceImplementation {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Satish");
		stringList.add("Abhi");
		stringList.add("Kundan");
		stringList.add("Amrish");
		
		ListIterator<String> listItr = stringList.listIterator();
		while(listItr.hasNext()) {
			String str = listItr.next();
			System.out.println("String is FORWARD DIRECTION: " + str);
		}
		System.out.println("-----------------------------------");
		while(listItr.hasPrevious()) {
			String str = listItr.previous();
			System.out.println("String is BACKWARD DIRECTION: " + str);
		}
	}
}
