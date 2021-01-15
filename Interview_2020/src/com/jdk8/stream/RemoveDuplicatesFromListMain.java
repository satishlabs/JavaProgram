package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListMain {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,4,3,2,4,2};
		List<Integer> listWithDuplicates = Arrays.asList(arr);
		
		Set<Integer> setWithoutDups =listWithDuplicates.stream().collect(Collectors.toSet()); 
		setWithoutDups.forEach(s->System.out.print(s+" "));
	}
}
