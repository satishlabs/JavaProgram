package com.array;

public class PrintOddEven {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.print("e"+" ");
			}else {
				System.out.print("o"+" ");
			}
		}
	}
}
