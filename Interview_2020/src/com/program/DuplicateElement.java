package com.program;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
		
		System.out.println("Duplicates elements are: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]){
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}
