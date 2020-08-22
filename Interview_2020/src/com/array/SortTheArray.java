package com.array;

public class SortTheArray {
	public static void main(String[] args) {
		int[] arr = {1,0,2,1,2,0,1,0,1,-1,-2};
		 sort(arr, arr.length);
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}

	private static void sort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int j=i;
			int k = arr[i];
			while((j>0) && (arr[j-1] > k)) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = k;
		}
		
	}
}
