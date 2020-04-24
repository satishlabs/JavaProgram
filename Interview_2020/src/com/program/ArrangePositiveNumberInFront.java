package com.program;

public class ArrangePositiveNumberInFront {
		public static void main(String[] args) {
			 int arr[] = { 7,-3, 2, -4, 5,-6 }; 
		        int n = arr.length; 
		        RearrangePosNeg(arr, n); 
		      //  RearrangePosPos(arr,n);
		        printArray(arr, n); 
		}

	/*
	 * private static void RearrangePosPos(int[] arr, int n) { int key,j; for() }
	 */

		static void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    }

		private static void RearrangePosNeg(int[] arr, int n) {
			int key,j;
			for(int i=1;i<n;i++) {
				key = arr[i];
				
				if(key>0)
					continue;
				j=i-1;
				while(j>=0 && arr[j]>0) {
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
				j=j-1;
			}
			
		}
}
