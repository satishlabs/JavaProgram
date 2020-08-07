package com.collection.list;

import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.add("Ms");
		names.add("Virat");
		names.add("Rohit");
		names.add("Sachin");
		names.add("Kohli");
		names.add("Sharma");
		names.add("Sehwag");
		names.add("Dravid");
		names.add("Dhoni");
		names.add("Bumrah");
		
		System.out.println(names.capacity()); //10
		//adding the 11th element in the vector
		names.add("Saurav");
		
		System.out.println(names.capacity());//20
	}
}
