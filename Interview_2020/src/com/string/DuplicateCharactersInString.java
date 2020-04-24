package com.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");
	}

	public static void duplicateCharCount(String inputStr) {
		char[] strArray = inputStr.toCharArray();
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for(char c: strArray){
			if(charCountMap.containsKey(c)){
				charCountMap.put(c, charCountMap.get(c)+1);
			}else{
				charCountMap.put(c, 1);
			}
		}
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate characters in String");
		for(char ch: charsInString){
			if(charCountMap.get(ch)>1){
				System.out.println(ch+" : "+charCountMap.get(ch));
			}
		}
	}
}
