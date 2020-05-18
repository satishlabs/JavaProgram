package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatElement {
	public static void main(String[] args) {
		Integer arr[] ={4,2,4,5,2,3,1};
		Integer arr_size = arr.length;
		printRepeatedNumber(arr,arr_size);
	}


	public static void printRepeatedNumber(Integer[] arr, Integer arr_size) {
		System.out.println("Repeated Numbers:");
		for(int i=0;i<arr_size;i++){
			for(int j=i+1;j<arr_size;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
}
