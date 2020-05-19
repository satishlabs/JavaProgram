package com.oops.interfce;

public class InterfaceTest2 {
	public static void main(String[] args) {
		int choice = 2;// user chocie
		
		Sort sortObj = null;
		if(choice  == 1) {
			sortObj = new InsertionSort();
		}else if(choice == 2) {
			sortObj = new QuickSort();
		}else if(choice == 3) {
			sortObj = new MergeSort();
		}
		
		sortObj.sort(new int[] {3,2,1});
	}
}
