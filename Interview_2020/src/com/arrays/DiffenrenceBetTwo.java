package com.arrays;

/*
 9->input array [1,3,4,7,8,9,10] and 2


    output-> find the no of pairs whosedifference is "2" like 3-1=2
    10-8=2
    9-7= 2

 * */
public class DiffenrenceBetTwo {
	public static void main(String[] args) {
		int[] arr= {2,1,3,4,7,8,9,10};
		int t=2;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] - arr[i] == t) {
					System.out.println(arr[j]+" - "+arr[i]+" = "+t);
				}
			}
		}
	}
}
