package com.program;

public class MoveZeroInStart {
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,3,0,4,0};
		
		moveZeroInStart(arr);
		System.out.print("-------------------------------------");
		moveZeroInLast(arr);
	}

	public static void moveZeroInLast(int[] arr) {
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[counter] =arr[i];
				counter++;
			}
		}
		while(counter<arr.length) {
			arr[counter]=0;
			counter++;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void moveZeroInStart(int[] arr) {
		int counter =arr.length-1;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i] !=0){
				arr[counter] =arr[i];
				counter--;
				//System.out.println(counter);
			}
		}
		while(counter>=0){
			arr[counter]=0;
			counter--;
			
		}
		//System.out.print(counter);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
