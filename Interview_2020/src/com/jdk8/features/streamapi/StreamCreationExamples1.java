package com.jdk8.features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExamples1 {
	public static void main(String[] args) {
		
		// Array can also be a source of a Stream
		Stream<String> streamArray = Stream.of("a","b","c","d");
		streamArray.forEach(System.out::println);
		
		System.out.println("-----------1----------------------");
		String[] str = new String[] {"aa","bb","cc","dd"};
		Stream<String> streamofArray = Arrays.stream(str);
		streamofArray.forEach(System.out::println);
		
		System.out.println("-----------------2-------------------");
		Stream<String> streamOfArrayPart = Arrays.stream(str,1,3);
		streamOfArrayPart.forEach(System.out::println);
		
		System.out.println("-----------------Builder---------------");
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		streamGenerated.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		Stream<Integer> streamIterated = Stream.iterate(1, n -> n + 2).limit(5);
		streamIterated.forEach(System.out::println);
	}
}
