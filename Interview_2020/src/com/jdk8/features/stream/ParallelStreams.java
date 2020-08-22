package com.jdk8.features.stream;

import java.util.Arrays;
import java.util.List;

/*
 A serial stream processes elements in an ordered manner, one at a time.

A parallel stream uses multiple threads to process data concurrently.

By default, the no of available CPUs affects the no of threads available for parallel stream
 * */
public class ParallelStreams {
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(1,2,3,4,5);
		//int sum =list.parallelStream().mapToInt(n -> n).sum();
		
		int sum = Arrays.asList(1,2,3,4,5).parallelStream().mapToInt(n -> n).sum();
		
		System.out.println(sum);
		
		System.out.println("================================================");
		
		Arrays.asList("Germany", "England","China", "Denmark", "Brazil").stream().forEach(System.out::println);
		
		System.out.println("================================================");
		//However, with a ParallelStream the data is processed in multiple threads. So, 
		//the order of the elements may vary as shown in following example:
		Arrays.asList("Germany", "England", "China", "Denmark", "Brazil").parallelStream().forEach(System.out::println);
		
		System.out.println("================================================");
		Arrays.asList("Germany", "England", "China", "Denmark", "Brazil").parallelStream().forEachOrdered(System.out::println);
	}
}
