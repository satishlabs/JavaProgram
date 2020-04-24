package com.jdk8.features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(s->System.out.print(s+" "));
	}
}
