package com.string;

public class CheckSpecialCharacterString {
	public static void main(String[] args) {
		String str = "Java String interview, questions*$%.";
		String spceialChar = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";
		
		for(int i=0;i<str.length();i++) {
			if(spceialChar.contains(Character.toString(str.charAt(i)))) {
				System.out.println(str.charAt(i)+" is a special charachter");
			}
		}
	}
}
