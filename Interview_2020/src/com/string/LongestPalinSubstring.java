package com.string;

public class LongestPalinSubstring {
	public static void main(String[] args) {
		String str="dabcba";
		//String str = "forgeeksskeegfor"; 
		System.out.println(isPalindrome(str));
	}

	public static String isPalindrome(String str) {
		if(str.isEmpty()) {
			return null;
		}
		if(str.length() ==1) {
			return str;
		}
		String longest = str.substring(0, 1);
		
		for(int i=0;i<str.length();i++) {
			String temp = helper(str,i,i);
			if(temp.length() >longest.length()) {
				longest = temp;
			}
			
			//get longest palindrome with center of i, i+1;
			temp = helper(str,i,i+1);
			if(temp.length() >longest.length()) {
				longest = temp;
			}
		}
		
		return longest;
	}

	private static String helper(String str, int start, int end) {
		while(start >= 0 && end <= str.length()-1 && str.charAt(start) == str.charAt(end)) {
			start--;
			end++;
		}
		return str.substring(start+1,end);
	}
}
