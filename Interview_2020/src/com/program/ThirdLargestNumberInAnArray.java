package com.program;

public class ThirdLargestNumberInAnArray {
	public static void main(String[] args) {
			int temp, size;
	      int arr[] = {10, 20, 25, 63, 96, 57};
	      size = arr.length;
	      
	      for(int i=0;i<size;i++) {
	    	  for(int j=i+1;j<size;j++) {
	    		  if(arr[i]>arr[j]) {
	    			  temp = arr[i];
	    			  arr[i] = arr[j];
	    			  arr[j]=temp;
	    		  }
	    	  }
	      }
	      System.out.println("Third second largest number is:: "+arr[size-2]);
	}
}
