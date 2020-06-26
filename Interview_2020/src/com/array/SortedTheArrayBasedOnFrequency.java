package com.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedTheArrayBasedOnFrequency {
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,3,6,6,6,2,2,5};
		
		findtheFrequencyInAscOrder(arr);
	}

	private static void findtheFrequencyInAscOrder(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		//System.out.println(map);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);;
	}
}
