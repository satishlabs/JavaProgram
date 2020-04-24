package com.jdk8.features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		//Here creating a parallel stream
		
		Stream<Integer> stream = list.parallelStream();
		Integer[] envenInteger = stream.filter(i->i%2==0).toArray(Integer[]::new);
		System.out.println(envenInteger);
	}
}
