package com.array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeOddEvenInArray {
	public static void main(String[] args) {
		List < Integer > odd = new ArrayList < Integer > ();

		List < Integer > even = new ArrayList < Integer > ();

		int arr [] = {0,2,3,98,1,6546,45323,1134564};
		
		int i;
		for( i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		System.out.println("Even: "+even);
		System.out.println("Odd: "+odd);
	}
}
