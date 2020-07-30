package com.astream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write Program to - Convert ArrayList of Integers to Streams - in java 8
 */
public class ConvertArrayListOfIntegersToStreamsExample {
	public static void main(String[] args) {
		 System.out.println("1. Create list of Integer");
		//Stream<Integer> stream = Stream.of(1,2,3,4);
		 
		 List<Integer> list = new ArrayList<>();
		 list.add(11);
		 list.add(12);
		 list.add(13);
		 list.add(14);
		 System.out.println("2. Convert list (ArrayList) of Integer to stream");
		 Stream<Integer> streamOfInteger = list.stream();
		 
		 System.out.println("3. Display Stream of Integer");
		 streamOfInteger.forEach(System.out::println);
	}
}
