package com.program;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		//removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 }; 
       // removeDuplicates1(arr); 

        int n = arr.length; 
        System.out.println("============##============");
        n = removeDuplicates(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    
	}

	static int removeDuplicates(int arr[], int n) 
    { 
		Arrays.sort(arr);
        if (n == 0 || n == 1) 
            return n; 

        int j = 0; 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       
        return j; 
    } 

	public static void removeDuplicates1(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

	private static void removeDuplicates(int[] arraywithduplicates) {
		System.out.println("Array with duplicates:");
		for(int i=0;i<arraywithduplicates.length;i++){
			System.out.print(arraywithduplicates[i]+" \t");
		}
		//Arrays.parallelSort(arraywithduplicates);
		int noOfUniqueElements = arraywithduplicates.length;
		for(int i=0;i<noOfUniqueElements;i++){
			for(int j=i+1;j<noOfUniqueElements;j++){
				 //If any two elements are found equal
				if(arraywithduplicates[i] == arraywithduplicates[j]){
					//Replace duplicate element with last unique element
					arraywithduplicates[j] = arraywithduplicates[noOfUniqueElements-1];
					 //Decrementing noOfUniqueElements
					noOfUniqueElements--;
					//Decrementing j
					j--;
				}
			}
		}
		int[] arrayWithoutduplicates = Arrays.copyOf(arraywithduplicates, noOfUniqueElements);
		System.out.println();
		System.out.println("Array Without duplicates: ");
		for(int i=0;i<arrayWithoutduplicates.length;i++){
			System.out.print(arrayWithoutduplicates[i]+" \t");
		}
		System.out.println();
		System.out.println("==============================");
	}
}

