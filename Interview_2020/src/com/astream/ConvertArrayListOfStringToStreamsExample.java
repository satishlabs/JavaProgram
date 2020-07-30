package com.astream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write Program to - Convert ArrayList of String to Streams - in java 8
 */
public class ConvertArrayListOfStringToStreamsExample {
	public static void main(String[] args) {
		 System.out.println("1. Create list of String");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		
		System.out.println("2. Convert list (ArrayList) of String to stream");
		Stream<String> streamOfString = list.stream();
		
		System.out.println("3. Display Stream of String");
		list.forEach(System.out::println);
	}
}
