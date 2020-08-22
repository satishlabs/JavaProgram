package com.string;

public class StringTest {
	public static void main(String[] args) {
		String str="satish";
		System.out.println(recursive(str));
		System.out.println(reverse(str));
	}

	/*
	 * private static String reverse(String str) { String str1=""; char[] strArray =
	 * str.toCharArray(); for(int i = strArray.length-1;i>=0;i--) { str1 =
	 * str1+strArray[i]; } return str1; }
	 */

	private static String reverse(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1 = str1+str.charAt(i);
		}
		return str1;
	}

	public static String recursive(String str) {
		if(str== null || str.length()<=1){
			return str;
		}
		return recursive(str.substring(1))+str.charAt(0);	
	}
}
