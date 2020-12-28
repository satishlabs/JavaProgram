package com.arr;

import java.util.ArrayList;
import java.util.List;

public class PairDifference {
	public static void main(String[] args) {
		int[] arr = {1,3,4,7,8,9,10,6} ;
		int n=2;
		findPair(arr,n);
	}

	public static int findPair(int[] input, int sum){
	    List<Integer> complementaries = new ArrayList<>(input.length);
	    int pairs = 0;
	    for(Integer number : input){
	        if(complementaries.contains(number)){
	            complementaries.remove(number);
	            pairs++;
	        }
	        else{
	            complementaries.add(sum-number);
	        }
	    }
	    return pairs;
	}
}
