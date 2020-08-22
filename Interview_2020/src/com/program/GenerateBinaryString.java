package com.program;

public class GenerateBinaryString {
	public static void main(String[] args) {
		GenerateBinaryString obj = new GenerateBinaryString();
		int length =2;
		obj.printBinaryCombination(length,"");
	}

	public void printBinaryCombination(int length, String str) {
		if(str.length() == length) {
			System.out.println(str);
			return;
		}
		printBinaryCombination(length, str+"0");
		printBinaryCombination(length, str+"1");
		//return null;
	}
 
	
}
