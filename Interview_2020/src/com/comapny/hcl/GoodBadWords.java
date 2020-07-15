package com.comapny.hcl;

import java.util.Scanner;

public class GoodBadWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println("====================");
		String[] good_words = {"papa", "book", "home", "cars", "jolly", "sugar", "friend", "mother", "father", "bloomiest"};
		String[] bad_words = {"ache", "slow", "torn", "slum", "boom", "rival", "wrong", "cholera", "revenge", "arrogant"};
		
		for(String str: good_words) {
			if(s.equalsIgnoreCase(str)) {
				System.out.println(s+" is "+"Good");
			}
		}
		
		for(String str: bad_words) {
			if(s.equalsIgnoreCase(str)) {
				System.out.println(s+" is "+"Bad");
			}
		}
	}
}
