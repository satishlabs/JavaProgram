package com.comapny.hcl;

import java.util.HashSet;
//Check if a given array contains duplicate elements within k distance from each other

public class CheckDuplicatesWithinK {
	public static void main(String[] args) {
		int arr[] ={10, 5, 3, 4, 3, 5, 6};
		if(checkDuplicatesWithinK(arr,3)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean checkDuplicatesWithinK(int[] arr, int k) {
		
		// Creates an empty hashset 
		HashSet<Integer>set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) 
				return true;
			
			set.add(arr[i]);
			
			if(i >= k){
				set.remove(arr[i-k]);
			}
		}
		
		return false;
	}
}
