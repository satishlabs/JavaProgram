package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStr {
	public static void main(String[] args) {
		String str = "SatishPrasad";
		reverseStr(str);
		/*for(int i=0;i<str.length();i++){
		for(int j=i+1;j<str.length();j++){
			if(charArr[i] == charArr[j]){
				System.out.println(charArr[j]);
				count++;
				break;
			}
		}
		
	}*/
		
	}

	public static void reverseStr(String str) {
		int count=0;
		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();
		for(Character c: charArr){
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c)+1);
			}else{
				charMap.put(c, 1);
			}
		}
		/*Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> chMap: entrySet){
			if(chMap.getValue()>1){
				System.out.println(chMap.getKey()+" : "+chMap.getValue());
			}
		}*/
		Set<Character> keys = charMap.keySet();
	    for(Character ch:keys){
	        if(charMap.get(ch) > 1){
	            System.out.println(ch+"--->"+charMap.get(ch));
	        }
	    }
		
	}
}
