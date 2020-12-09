package com.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		IntStream.of(new int[] {4,7,1,8,3,5,9,7}).filter((int i) -> i>5).distinct().forEach(System.out::println);
		
		List<String> names = new ArrayList<String>();
		names.add("Satish");
		names.add("Amrish");
		names.add("Kundan");
		names.add("Manish");
		names.add("Rama");
		
		names.stream().filter((String name)->name.length()>5).skip(2).forEach(System.out::println);
		
		System.out.println("**********Parallel Stream**************");
		System.out.println();
		names.parallelStream().filter((String name)->name.length()>5).skip(2).forEach(System.out::println);
		System.out.println("************************");
		System.out.println();
		//Streams are traversable only once
		//You can’t traverse the streams more than once just like iterators. 
		//If you traverse the stream first time, it is said to be consumed.
		List<String> nameList = Arrays.asList("Satish","Ross","Dhoni","Kohli");
		Stream<String> stream = nameList.stream();
		//stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		
		System.out.println("************************");
		System.out.println();
		
		Stream<Student> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());
		
		System.out.println("************************");
		System.out.println();
		
		Stream<Student> singleStream = Stream.of(new Student());
		System.out.println(singleStream.count());
		System.out.println("************************");
		System.out.println();
		
		Stream<Integer> streamOfNumbers = Stream.of(7,2,6,9,4,3,1);
		System.out.println(streamOfNumbers.count());
		
		System.out.println("************************");
		System.out.println();
		
		List<String> listOfStrings = new ArrayList<>();
        
		listOfStrings.add("One");
		         
		listOfStrings.add("Two");
		         
		listOfStrings.add("Three");
		         
		listOfStrings.stream().forEach(System.out::println);
		
		System.out.println("************************");
		System.out.println();
		
		names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		names.add("John");
		         
		//Selecting names containing more than 5 characters
		names.stream().filter((String name)->name.length()>5).forEach(System.out::println);
		
		System.out.println("************************");
		System.out.println();
		
		names.stream().distinct().forEach(System.out::println);
		
		
	}
}
