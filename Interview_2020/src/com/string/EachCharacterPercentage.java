package com.string;

import java.text.DecimalFormat;

public class EachCharacterPercentage {
	public static void main(String[] args) {
		characterPercentage("Hello 123 %# Java @@ Wordl");
	}

	private static void characterPercentage(String str) {
		int totalChars = str.length();
		
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int digits = 0;
		int others = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//If ch is in uppercase, then incrementing upperCaseLetters
			if(Character.isUpperCase(ch)) {
				upperCaseLetters++;
			}else if(Character.isLowerCase(ch)){
				//If ch is in lowercase, then incrementing lowerCaseLetters
				lowerCaseLetters++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				others++;
			}
		}
		//Calculating percentage of uppercase letters, lowercase letters, digits and other characters
        
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;
         
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
         
        double digitsPercentage = (digits * 100.0) / totalChars;
         
        double otherCharPercentage = (others * 100.0) / totalChars;
         
        DecimalFormat formatter = new DecimalFormat("##.##");
         
        //Printing percentage of uppercase letters, lowercase letters, digits and other characters
         
        System.out.println("In '"+str+"' : ");
         
        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");
         
        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");
         
        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
         
        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
         
        System.out.println("-----------------------------");
	}
}
