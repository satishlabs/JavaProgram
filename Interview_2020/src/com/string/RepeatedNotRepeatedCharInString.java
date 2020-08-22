package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedNotRepeatedCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input  = sc.next();
		firstRepeatedNonRepeatedChar(input);
	}

	public static void firstRepeatedNonRepeatedChar(String input) {
		char[] strArray = input.toCharArray();
		HashMap<Character, Integer> charMapCount = new HashMap<>();
		for(char c: strArray){
			if(charMapCount.containsKey(c)){
				charMapCount.put(c, charMapCount.get(c)+1);
			}else{
				charMapCount.put(c, 1);
			}
		}
		for(char c: strArray){
			if(charMapCount.get(c)==1){
				System.out.println("First Non repeated char in "+input+" is "+c);
				break;
			}
		}
		for(char c: strArray){
			if(charMapCount.get(c)>1){
				System.out.println("First repeated char in "+input+" is "+c);
				break;
			}
		}
	}
}
