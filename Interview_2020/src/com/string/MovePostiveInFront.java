package com.string;

import java.util.Arrays;

public class MovePostiveInFront {
	public static void main(String[] args) {
		int arr[] = { -7,3, -2, 4, -5, 6  }; 
        int n = arr.length; 
  
        rearrange(arr, n);
	}

	public static void rearrange(int[] arr, int n) {
		int j=0,temp = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				if(i != j) {
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
}
