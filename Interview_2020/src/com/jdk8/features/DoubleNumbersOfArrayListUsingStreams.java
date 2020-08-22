package com.jdk8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class DoubleNumbersOfArrayListUsingStreams {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> doubleArrayListNumbers = list.stream()
								.map(i->i*2)
								.collect(toList());
	}

	public static Collector toList() {
		
		return null;
	}
}
