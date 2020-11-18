package com.arr;
/*
Input:  array = {5, 6, 7, 8, 9, 10, 1, 2, 3}
        Key = 2
Output: Index: 7

Input:  array = {5, 1, 2, 3, 4}
        Key = 1
Output: Index: 1

Input:  array = {5, 1, 2, 3, 4}
        Key = 4
Output: Index: 4

*/

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int arr[] = {5,1,2,3,4};
		int key =4;
        System.out.println("Index of the element is : " + searchInSortedRotatedArray(arr, key, 0, arr.length - 1));
	}

	private static int searchInSortedRotatedArray(int[] arr, int key, int start, int end) {
		if(start > end) {
			return -1;
		}
		
		int mid = start+(end-start)/2;
		if(arr[mid] == key) {
			return mid;
		}
		if(arr[mid] <= arr[end]) {
			if(key >= arr[mid] && key <= arr[end]) {
				return searchInSortedRotatedArray(arr, key, mid+1, end);
			}else {
				return searchInSortedRotatedArray(arr, key, start, mid-1);
			}
		}
		 if (arr[start] <= arr[mid]) {
	            if (key >= arr[start] && key <= arr[mid]) {
	                return searchInSortedRotatedArray(arr, key, start, mid-1);
	            } else {
	                return searchInSortedRotatedArray(arr, key, mid+1, end);
	            }
	        }
		return -1;
	}
}
