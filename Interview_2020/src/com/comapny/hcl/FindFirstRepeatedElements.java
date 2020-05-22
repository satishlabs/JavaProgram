package com.comapny.hcl;

import java.util.HashSet;

public class FindFirstRepeatedElements {
	public static void main(String[] args) {
		 int arr[] = {2,10, 3, 5, 3, 4, 3, 5, 6, 2}; 
	        printFirstRepeating(arr);
	}

	public static void printFirstRepeating(int[] arr) {
		int min =-1;
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(set.contains(arr[i]))
				min =i;
			else
				set.add(arr[i]);
		}
		if(min != -1) {
			System.out.println("First Repeated elements: "+arr[min]);
		}else {
			System.out.println("There is no repeating elements");
		}
	}
}
