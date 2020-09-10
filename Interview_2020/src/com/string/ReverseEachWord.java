package com.string;

public class ReverseEachWord {
	public static void main(String[] args) {
		reverseEachWordOfString("Reverse Me");
	}

	private static void reverseEachWordOfString(String str) {
		String[] words = str.split(" ");
		String reverseString = "";
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j = word.length()-1;j>=0; j--) {
				reverseWord = reverseWord+word.charAt(j);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(str);
        
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
	}
}
