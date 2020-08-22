package com.string;

import java.util.Scanner;

public class PalindromeProgram {
	public static void main(String[] args) {
		System.out.println("Enter the input string");
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.next();
		if(isPalindrome(inputString)){
			System.out.println(inputString+" is Palindrome");
		}else{
			System.out.println(inputString+" is not Palindrome");
		}
		sc.close();
	}

	public static boolean isPalindrome(String inputString) {
		String newStr = inputString.replaceAll("\\s", "").toLowerCase();
		int i=0;
		int j= newStr.length()-1;
		while(i<j){
			if(newStr.charAt(i) != newStr.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
