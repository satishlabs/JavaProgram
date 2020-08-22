package com.arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int l = a.length;
		int miss = getMissingNumber(a,l);
		System.out.println(miss);
	}

	private static int getMissingNumber(int[] a, int n) {
		int i,total;
		total = (n+1)*(n+2)/2;
		System.out.println("Missing number");
		for(i=0;i<n;i++){
			total = total-a[i];
		}
		return total;
	}
}
