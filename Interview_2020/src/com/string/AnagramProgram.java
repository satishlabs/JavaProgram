package com.string;

import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {
		isAnagram("keEp", "peeK");
		isAnagram("Satish", "ishs");
		isAnagram("Toss", "Shot");
	}

	public static void isAnagram(String s1, String s2) {
		String copyOfS1 = s1.replaceAll("\\s", "");	
		String copyOfS2 = s2.replaceAll("\\s", "");	
		
		boolean status = true;
		if(copyOfS1.length() != copyOfS2.length()){
			status = false;
		}else{
			char[] s1Array = copyOfS1.toLowerCase().toCharArray();
			char[] s2Array = copyOfS2.toLowerCase().toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);	
			status=Arrays.equals(s1Array, s2Array);
		}
		if(status){
			System.out.println(s1+" and "+s2+" are anagrams");
		}else{
			 System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
}
