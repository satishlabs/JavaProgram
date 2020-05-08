package com.program;

public class SplitNumDigitsSpecailChar {
	public static void main(String[] args) {
		String str = "satish01$$for02prasad03!@!!"; 
        splitString(str); 
	}

	private static void splitString(String str) {
		StringBuffer alpha = new StringBuffer();
		StringBuffer digits = new StringBuffer();
		StringBuffer specialChar = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digits.append(str.charAt(i));
			}else if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			}else {
				specialChar.append(str.charAt(i));
			}
			
		}
		System.out.println("Aplhanumeric: "+alpha);
		System.out.println("Digits: "+digits);
		System.out.println("SpecialChar: "+specialChar);
		
	}
}
