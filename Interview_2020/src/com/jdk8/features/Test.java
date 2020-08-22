package com.jdk8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<List<Integer>> result = Stream.of(Arrays.asList(1), Arrays.asList(2, 3)).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> result2 = Stream.of(Arrays.asList(1),Arrays.asList(2,3)).flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(result2);
	}	
}
