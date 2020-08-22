package com.jdk8.features.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreationExamples {
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("Java","C++","C","PHP",".Net","Spring","Hibernate");
		Stream<String> stream1 = collection.stream();
		stream1.forEach(System.out::println);
		
		System.out.println("================List====================");
		List<String> list = Arrays.asList("JAVA","J2EE","SPRING","HIBERNATE");
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		
		System.out.println("===============Set=======================");
		Set<String> set = new HashSet<>(list);
		Stream<String> stream3 = set.stream();
		stream3.forEach(System.out::println);
	}
}
