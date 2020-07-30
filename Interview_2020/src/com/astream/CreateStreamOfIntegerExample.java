package com.astream;

import java.util.stream.Stream;

/**
 * Write Program to - Create Stream of Integer - in java 8
 */
public class CreateStreamOfIntegerExample {
	public static void main(String[] args) {
		 System.out.println("1. Create Stream of Integer");
         
         System.out.println("1.1 Create Stream of Integer using - of() method of Stream and passing the integers");
         Stream<Integer> streamOfInteger = Stream.of(11,12,13);
         System.out.println("1.2 Create Stream of Integer using - of() method of Stream and passing Integer array");
         
         Stream<Integer> streamOfInteger1 = Stream.of(new Integer[] {11,12,13});
         System.out.println("2. Display Stream of Integer");
         streamOfInteger.forEach(System.out::println);
	}
}
