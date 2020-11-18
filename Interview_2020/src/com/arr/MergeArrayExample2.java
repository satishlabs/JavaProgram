package com.arr;

import java.util.Arrays;

public class MergeArrayExample2 {
	public static void main(String[] args) {
		int[] firstArray = {56,78,90,32,67,12}; //initialized array  
		int[] secondArray = {11,14,9,5,2,23,15};  
		int len = firstArray.length+secondArray.length;
		
		int[] mergedArray = new int[len];
		
		int pos=0;
		for(int el : firstArray) {
			mergedArray[pos] = el;
			pos++;
		}
		
		for(int el: secondArray) {
			mergedArray[pos] = el;
			pos++;
		}
		
		System.out.println(Arrays.toString(mergedArray));
	}
}
