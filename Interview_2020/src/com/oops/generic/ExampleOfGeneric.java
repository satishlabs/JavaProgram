package com.oops.generic;

import java.util.ArrayList;

//Onward java 5, Collection framework supports the generic concept. You can see the example of ArrayList.

public class ExampleOfGeneric {
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<>();
		listOfNames.add("Satish");
		listOfNames.add("MsDhoni");
		
		for(String s: listOfNames) {
			System.out.println(s);
		}
	}
}
