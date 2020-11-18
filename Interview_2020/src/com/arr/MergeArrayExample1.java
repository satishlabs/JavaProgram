package com.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrayExample1 {
	public static void main(String[] args) {
		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
		int[] secondArray = {77,11,45,88,32,56,3}; 
		List list = new ArrayList<>();
		list.add(firstArray);
		list.add(secondArray);
		
		
		
		int fal = firstArray.length;
		int sal = secondArray.length;
		int[] result = new int[fal+sal];
		
		System.arraycopy(firstArray, 0, result, 0, fal);
		System.arraycopy(secondArray, 0, result, fal, sal);
		
		System.out.println(Arrays.toString(result));
	}
}
