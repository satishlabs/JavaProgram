package com.jdk8.features;

import java.util.Arrays;
import java.util.stream.Stream;

//A parallel stream uses multiple threads to process data concurrently.
//We can use parallel() to create parallel stream from existing sequential stream.


public class ParallelStream {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Germany", "England", "China","Denmark", "Brazil");
		Stream<String> parallelStream = stream.parallel();
		//OR
		//We can also use parallelStream() method to create a parallel stream from a collection :
		Stream<String> parallelStream2 = Arrays.asList("Germany", "England",
                "China", "Denmark", "Brazil").parallelStream();
	}
}
