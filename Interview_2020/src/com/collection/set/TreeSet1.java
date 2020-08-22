package com.collection.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSet1 {
	public static void main(String[] args) {
		//1. Create TreeSet
		TreeSet<String> TreeSet = new TreeSet<>();
		
		TreeSet.add("A");
		TreeSet.add("B");
		TreeSet.add("C");
		TreeSet.add("D");
		TreeSet.add("E");
		
		System.out.println(TreeSet);
		
		Iterator<String> itr = TreeSet.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println("Value: "+value);
		}
		//JDK8
		TreeSet.forEach(list->System.out.println(list));
		
		boolean found = TreeSet.contains("B");
		System.out.println(found);
		
		//Convert TreeSet to Array Example
		
		String[] values = new String[TreeSet.size()];
		 
		TreeSet.toArray(values);
		 
		System.out.println(Arrays.toString(values));
		
		System.out.println("========================================");
		//Convert TreeSet to ArrayList Example
		List<String> valueList = TreeSet.stream().collect(Collectors.toList());
		System.out.println(valueList);
	}
}
