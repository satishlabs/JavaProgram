package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatElement {
	public static void main(String[] args) {
		Integer arr[] ={4,2,4,5,2,3,4,1};
		Integer arr_size = arr.length;
		printRepeatedNumber1(arr);
		//printRepeatedNumber2(arr);
		//printRepeatedNumber(arr,arr_size);
		
		//Arrays.stream(arr).distinct().forEach(x -> System.out.println(x+" repeated "+Collections.frequency(Arrays.asList(arr), x)+" times."));
	}


	private static void printRepeatedNumber2(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		Set<Integer> set = map.keySet();
		for(Integer in : set) {
			if(map.get(in) >1) {
				System.out.println(in+" repeted "+map.get(in)+" times.");
			}
		}
	}


	private static void printRepeatedNumber1(Integer[] arr) {
		int count=0;
		int temp=0;
		Arrays.sort(arr);
		int i;
		for(i=0;i<arr.length;i++) {
			temp = arr[i];
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(temp == arr[j]) {
					count++;
				}
			}
	
		}
		 System.out.println("Number:" + arr[i] + "repeated :" + count + " times");
	}


	public static void printRepeatedNumber(Integer[] arr, Integer arr_size) {
		System.out.println("Repeated Numbers:");
		int count=0;
		for(int i=0;i<arr_size;i++){
			for(int j=i+1;j<arr_size;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]+" "+count);
				}
			}
		}
	}
}
