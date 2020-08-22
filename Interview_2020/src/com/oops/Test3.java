package com.oops;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
		//final int x=10;
		//byte b=x;
		//System.out.println(b);
		
		Collection<String> collection = new TreeSet<>();
		collection.add("foo");
		collection.add("bar");
		collection.add("baz");
		
		collection.forEach(System.out::println);
	}
}
