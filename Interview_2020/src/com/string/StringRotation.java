package com.string;
public class StringRotation {
	public static void main(String[] args) {
		String s1="satish";
		String s2="ishsat";
		if(areRotations(s1,s2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	public static boolean areRotations(String s1, String s2) {
		return((s1.length() == s2.length()) && (s1+s2).contains(s2));
		
	}
}