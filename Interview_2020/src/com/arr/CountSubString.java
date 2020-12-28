package com.arr;

public class CountSubString {
	public static void main(String[] args) {
		String str="aabcdhybcdxxx";
		String subStr="bcd";
		
		System.out.println(str.substring(5));
		System.out.println(str.indexOf(subStr));
		int n = str.indexOf(subStr)+subStr.length();
		System.out.println(n+" "+str.substring(5));
		System.out.println(count(str,subStr));
	}

	private static int count(String str, String subStr) {
		int count=0;
		while(str.contains(subStr)) {
			count++;
			str = str.substring(str.indexOf(subStr)+subStr.length());
		}
		return count;
	}
}
