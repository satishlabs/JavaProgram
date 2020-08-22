package com.array;

import java.util.Arrays;

public class RepeatedElement {
	public static void main(String[] args) {
		int[] array = new int[] { 12, 0, -22, 0, 43, 545, -4, -55, 12, 43, 0, -999, -87 };
	    int counter = 0, temp = 0;// variable that holds the temporary value of each element
	    Arrays.sort(array);
	    for (int i = 0; i < array.length; i++) {
	        temp = array[i];
	        counter = 0;
	        for (int j = 0; j < array.length; j++) {
	            if (temp == array[j]) {
	                counter++;
	            }
	        }
	        System.out.println("Number:" + array[i] + "occurs :" + counter + " times");
	    }
	}
}
