package com.jdk8.features.parallel;

import java.util.Arrays;

public class ParallelArraySorting1 {
	public static void main(String[] args) {
		int[] arr = {5,8,1,0,6,9};
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Sorting array elements parallel and passing start, end index");
		Arrays.parallelSort(arr, 0, 4);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
