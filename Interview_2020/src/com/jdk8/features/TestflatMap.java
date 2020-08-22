package com.jdk8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 Stream flatMap is a combination of two operations .. a map operation and a flatten operation.

To understand this, consider an example of multiple lists of elements like {a,b}, {c,d,e},.. etc.

Now, if we want to get all the elements in sequence, we can’t use a map since we have a non-flat structure here.

For this, we can use flatMap() to flatten it to a structure like {a,b,c,d,e,.. } .

In this example, we have a Stream of multiple lists of numbers and we are looking to get numbers from it in sequence.
 * */

public class TestflatMap {
	public static void main(String[] args) {
		Stream<List<Integer>> numberStream = Stream.of(
				Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8)
				);
		
		numberStream.flatMap(n -> n.stream())
					.filter(n -> n%2 ==0)
					.forEach(System.out::println);
	}
}
