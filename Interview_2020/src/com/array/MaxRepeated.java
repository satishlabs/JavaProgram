package com.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//Find the maximum repeating number in O(n) time and O(1) extra space

public class MaxRepeated {
	public static void main(String[] args) {
		 int arr[] = {2, 3, 3, 5, 3, 4, 1, 7}; 
	     maxRepeating(arr); 

	     //With Stream API
	     Long result = Arrays.stream(arr)
	    		 .boxed()
	    		 .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
	    		 .values()
	    		 .stream()
	    		 .max(Comparator.comparing(i -> i))
	    		 .orElseThrow(RuntimeException::new);
	     System.out.println("Result: "+result);
	     
	     int n = arr.length; 
	        int k=n; 
	        System.out.println("Maximum repeating element is: " + 
	                           maxRepeating1(arr,n,k)); 
	}

	//O(n) time and O(1) extra space approach
	private static int maxRepeating1(int[] arr, int n, int k) {
		
		for(int i=0;i<arr.length;i++)
			arr[(arr[i]%k)]+=k;
		 // Find index of the maximum repeating element 
		int max = arr[0];
		int result =0;
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = i;
			}
		}
		return result;
	}
	//O(n2)
	private static void maxRepeating(int[] arr) {
		int max  = 0;
		for(int i =0;i <arr.length;i++) {
			int count = 0;
			for(int j= 0;j<arr.length;j++) {
				if(arr[i] == arr[j]) 
					count++;
			}
			if(count >= max) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
