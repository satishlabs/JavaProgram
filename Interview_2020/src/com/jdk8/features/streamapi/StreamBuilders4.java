package com.jdk8.features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders4 {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		//List<Integer> evenNumberList = stream.filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(evenNumberList);
		
		 Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
	}
}
