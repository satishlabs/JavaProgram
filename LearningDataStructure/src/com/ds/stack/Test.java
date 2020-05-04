package com.ds.stack;

public class Test {
	public static void main(String[] args) {
		int[] arr = {2,5,9,1,2,4,6,8,11,20,21,34};
		System.out.println(countEvents(arr));
		int a= getElementFrom(arr,5);
		System.out.println(a);
	}

	private static int getElementFrom(int[] arr, int i) {
		return arr[i];
	}

	private static int countEvents(int[] arr) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					count++;
				}
			}
		return count;
	}
}
