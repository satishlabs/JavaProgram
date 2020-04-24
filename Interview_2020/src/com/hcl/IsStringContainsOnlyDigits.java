package com.hcl;

import java.util.regex.Pattern;

public class IsStringContainsOnlyDigits {
	public static void main(String[] args) {
		String str="2340";
		if(str.matches("[0-9]+") && str.length()>1){
			System.out.println("Only Digits");
		}else if (str.matches("[a-zA-Z]+") && str.length() > 2) {
			System.out.println("Only String");
		}else {
			System.out.println("Alphanumeric value");
		}
	}
}
