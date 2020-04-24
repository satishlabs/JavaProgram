package com.program;

public class FindDuplicate {
	public static void main(String[] args) {
		FindDuplicate duplicate = new FindDuplicate();
		int[] arr= {1,2,3,1,3,6,6};
		int arr_size = arr.length;
		
		//duplicate.printRepeated(arr,arr_size);
		//duplicate.printRepeated1(arr,arr_size);
		duplicate.printRepeated2(arr,arr_size);
	}

	void printRepeated2(int arr[], int size)  
    { 
        int count[] = new int[size]; 
        int i; 
  
        System.out.println("Repeated elements are1 : "); 
        for (i = 0; i < size; i++)  
        { 
            if (count[arr[i]] == 1) 
                System.out.print(arr[i] + " "); 
            else
                count[arr[i]]++; 
        } 
    } 

	public void printRepeated1(int[] arr, int arr_size) {
		for(int i=0;i<arr_size;i++) {
			for(int j=i+1;j<arr_size;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}

	public void printRepeated(int[] arr, int size) {
		
			System.out.println("The repeated elements are: ");
			for (int i = 0; i < size; i++) 
	        { 
	            if (arr[ Math.abs(arr[i])] >= 0) 
	                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " "); 
	        }  
	}
}
