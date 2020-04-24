package com.arrays;

public class RepeatElement {
	public static void main(String[] args) {
		int arr[] ={4,2,4,5,2,3,1};
		int arr_size = arr.length;
		printRepeatedNumber(arr,arr_size);
	}

	public static void printRepeatedNumber(int[] arr, int arr_size) {
		System.out.println("Repeated Numbers:");
		for(int i=0;i<arr_size;i++){
			for(int j=i+1;j<arr_size;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
}
