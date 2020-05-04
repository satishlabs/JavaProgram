package com.ds.stack;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(reverseString("HELLO"));
	}

	public static String reverseString(String str) {
		int stackSize = str.length(); //get the max stack size
		Stack theStack = new Stack(stackSize); //we make the stack
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); //getting a char from the input string
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = (char) theStack.pop();
			result = result + ch;
		}
		return result;
	}
}
