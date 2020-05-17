package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 A stream operates on a data source, such as an array or a collection.
A stream, itself, does not provide storage for the data, it simply moves data and performs operations 
on data such as filtering, sorting etc
 * */
public class Stream1 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		for(int i=0;i<5;i++) {
			list.add(i);
		}
		
		Stream stream = list.stream();
		stream.forEach(System.out::println);
	}
}
