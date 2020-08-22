package com.collection.list;

public class Test {
	public static void main(String[] args) {
		String s = "12, 41, 21, 19, 15, 10"; 
		
		String[] split = s.split(", ");
		
		System.out.println(split);
		
		int[] nums = new int[split.length];
		for(int i = 0; i < split.length; i++){
		  nums[i] = Integer.parseInt(split[i]);
		}
		
		
	}
}
