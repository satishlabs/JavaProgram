package com.jdk8.features;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinAndMax {
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer max = Stream.of(arr)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		
		Integer min = Stream.of(arr)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
