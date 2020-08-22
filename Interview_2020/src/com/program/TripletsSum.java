package com.program;

import java.util.Arrays;

public class TripletsSum {
	public static void main(String[] args) {
		int[] arr = new int[]{ 0, -1, 2, -3, 1 };
		int sum=0;
		int n = arr.length;
		sumOfThreeNumbers(arr,n,sum);
		//sumOfThreeNumbers1(arr);
	}

	public static void sumOfThreeNumbers(int[] arr, int n, int sum) {
		Arrays.sort(arr);

		for(int i=0;i<n-1;i++) {
			int l=i+1;
			int r=n-1;;
			int x = arr[i];
			while(l<r) {
				if(x+arr[l]+arr[r]==sum) {
					System.out.println(x+" "+arr[l]+" "+arr[r]);
					l++;
					r--;
				}else if(x+arr[l]+arr[r]<sum) {
					l++;
				}else {
					r--;
				}
			}
		}

	}


	public static void sumOfThreeNumbers1(int[] arr) {
		int n = arr.length-1; 
		for(int i=0;i<n;i++) { 
			int k=arr[i]; 
			int l=i+1; 
			int r=n-1; 
			while(l<r) {
				if(k+arr[l]+arr[r]==0) {
					System.out.println(arr[l]+" "+arr[r]+" "+k);
					l++;
					r--; 
				}else if(k+arr[l]+arr[r]<0) { 
					l++;
				}else {
					r--;
				} 
			} 
		} 
	}

}
