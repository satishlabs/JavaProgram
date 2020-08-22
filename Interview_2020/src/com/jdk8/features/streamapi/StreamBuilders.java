package com.jdk8.features.streamapi;

import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p->System.out.print(p+" "));
		
		Stream<String> stream1 = Stream.empty();
		stream1.forEach(System.out::println);
	}
	public Stream<String> streamOf(List<String> list) {
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}
}
