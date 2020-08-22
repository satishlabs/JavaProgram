package com.jdk9.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = Stream.of(1,2,3,4,5,6,7,8,9,10)
						.takeWhile(i->(i%2==0)).collect(Collectors.toList());
		//This example returns an empty list because it fails at first list element, and takewhile stops here.
		System.out.println(list); //[]
		
		list = Stream.of(2,2,3,4,5,6,7,8,9,10)
				.takeWhile(i->(i%2==0)).collect(Collectors.toList());
		//In this example, we are getting first two elements because these are even and stops at third element
		System.out.println(list); //[2, 2]
		
		 list = Stream.of(2,2,3,4,5,6,7,8,9,10)
					.dropWhile(i->(i%2==0)).collect(Collectors.toList());
		 //Stream dropWhile method returns result on the basis of order of stream elements.
		 System.out.println(list); //[3, 4, 5, 6, 7, 8, 9, 10]
		 
		 list   = Stream.of(2,2,3,4,5,6,7,8,9,10)  
	                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());   
		 //Stream ofNullable method returns a sequential stream that contains a single element, if non-null. Otherwise, it returns an empty stream.
	    System.out.println(list);  
	    
	    Stream<Integer> val = Stream.ofNullable(null);
	    val.forEach(System.out::println);
	    
	    //A new overloaded method iterate is added to the Java 9 stream interface. This method allows us to iterate stream elements till the specified condition.
	    Stream.iterate(1, i -> i <= 10, i -> i*3).forEach(System.out::println);
	}
}
