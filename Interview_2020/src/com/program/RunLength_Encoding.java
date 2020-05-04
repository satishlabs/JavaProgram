package com.program;

public class RunLength_Encoding {
	public static void main(String[] args) {
		String str = "abaaabbddeedddaaa";
		//printRLE(str);
		String str1 = compress(str);
		System.out.println(str1);
	}
	//ab3a2b2d2e3d
	public static String compress(String str) {
		int count=1;
		char currentChar = str.charAt(0);
		String newString ="";
		for(int i=1;i<str.length();i++) {
			if(currentChar == str.charAt(i)) {
				count++;
			}else {
				if(count == 1) {
					newString+= Character.toString(currentChar);
				}else {
					newString += Integer.toString(count)+Character.toString(currentChar);
				}
				count=1;
			}
			currentChar = str.charAt(i);
		}
		
		return newString;
		
		
	}
	//a1b1a3b2d2e2d3a3
	private static void printRLE(String str) {
		int n = str.length();
		for(int i=0;i<n;i++) {
			int count = 1;
			while(i<n-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i)+""+count);
			//System.out.println(count);
		}
		
	}
}
