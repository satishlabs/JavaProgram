package com.string.abst;

public class SecondMax {
	public static void main(String[] args) {
		 int arr[] = {12, 35, 1, 10, 34, 1}; 
         int n = arr.length; 
         print2largest(arr, n); 
	}

	public static void print2largest(int[] arr, int n) {
		int first,second;
		if(n<2) {
			System.out.println("Invalid input");
		}
		
		first = second = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
				second = first;
				first =arr[i];
			}else if(arr[i]>second && arr[i]!= first) {
				second = arr[i];
			}
		}
		if(second == Integer.MIN_VALUE) {
			System.out.println("There is not second element");
		}else {
			System.out.println("the second largest element is: "+second);
		}
	}
}
