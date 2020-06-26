package com.array;

public class RepeatElement {
	public static int[] noDups(int[] myArray) {
	    int j = 0;
	    for (int i = 1; i < myArray.length; i++) {
	        if (myArray[i] != myArray[j]) {
	            j++;
	            myArray[j] = myArray[i];
	        }
	    }
	    return myArray;
	}
	  
	    public static void main(String[] args)  
	    { 
	        RepeatElement repeat = new RepeatElement(); 
	        int arr[] = {1, 2, 4, 5, 2, 3, 1, 4}; 
	        int arr_size = arr.length; 
	        System.out.println(arr);
	    
    }
}
