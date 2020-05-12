package com.jdk8.features.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//stream
		System.out.println(numbers.stream().filter(e->e%2==0)
						.mapToInt(e->e*2)
						.sum());
		
		//parallelStream
		System.out.println(numbers.parallelStream().filter(e->e%2==0)
				.mapToInt(e->e*2)
				.sum());
		
		//Without stream API
		for(int i: numbers) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		//With stream API
		numbers.stream().filter(e->e%2==0)
						.forEach(e->System.out.print(e+" "));
		
		//creating stream API
		//1. Stream.of(arrayOfElements)
		System.out.println();
		System.out.println("Stream.of(arrayOfElements):");
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream1.forEach(e->System.out.print(e+" "));
		
		//2. Stream.of(val1,val2,val3)
		System.out.println();
		System.out.println("Stream.of(val1,val2,val3...)");
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
		stream2.forEach(p->System.out.print(p+" "));
		
		//3. someList.stream()
		System.out.println();
		System.out.println("================someList.stream()=========");
		System.out.println();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<10;i++) {
			list.add(i);
		}
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(e->System.out.print(e+" "));
		//4. using String chars or String tokens
		System.out.println();
		System.out.println("=======================================");
		IntStream stream4 = "123456789.abcdefg".chars();
		stream4.forEach(p->System.out.print(p+" "));
		
		System.out.println();
		System.out.println("===========================================");
		//5. using Stream.generate() or Stream.iterate() functions
		Stream<Date> steam4 = Stream.generate(()->{
			return new Date();
		});
		stream4.forEach(d -> System.out.print(d+" "));
	}
}
