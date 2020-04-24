package com.string;

import java.util.Arrays;

public class MoveZeroStart {
	public static void main(String[] args) {
		moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
		 moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
		 
	}

	public static void moveZerosToEnd(int[] input) {
		int counter=0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]!= 0) {
				input[counter] = input[i];
				counter++;
			}
		}
		while(counter<input.length) {
			input[counter] =0;
			counter++;
		}
		System.out.println(Arrays.toString(input));
	}

	public static void moveZerosToFront(int[] input) {
		int counter =input.length-1;
		for(int i=input.length-1 ;i>=0;i--) {
			if(input[i] != 0) {
				input[counter] = input[i];
				counter--;
			}
		}
		while(counter>=0) {
			input[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(input));
	}
}
