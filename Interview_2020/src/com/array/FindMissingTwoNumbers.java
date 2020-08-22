package com.array;

public class FindMissingTwoNumbers {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7};
		int n  = arr.length+2;
		findMissingTwoNumbers(arr,n);
	}

	private static void findMissingTwoNumbers(int[] arr, int n) {
		boolean[] marks = new boolean[n+1];
		for(int i=0;i<n-2;i++) {
			marks[arr[i]] = true;
		}
		System.out.println("Missing numbers");
		for(int i=1;i<=n;i++) {
			if(!marks[i]) {
				System.out.print(i+" ");
				System.out.println();
			}
		}
		
	}
}
