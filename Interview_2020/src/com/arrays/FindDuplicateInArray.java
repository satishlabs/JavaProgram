package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		Integer[] arr = {1,1,4,2,3,4,2,5,7,6,4};
		
		List<Integer> numList = Arrays.asList(arr);
		List<Integer> arrList = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(arrList);
	}
}
