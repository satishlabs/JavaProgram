package com.program;

public class LargestSmallest {
	public static void main(String[] args) {
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		int min = a[0];
		int max = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
