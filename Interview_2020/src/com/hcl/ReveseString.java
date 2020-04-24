package com.hcl;

import java.util.Stack;

public class ReveseString {
	public static void main(String[] args) {
		String str="2*50+3-10";
		//String str="2+3*5";
		reverseEquation(str);
		//reverseEquation1(str);
		//System.out.println(reverseEquation(str));
	}

	public static void reverseEquation(String str) {
		String[] operators = {"\\+","-","\\*","/"};
		for(String op: operators) {
			str = str.replaceAll(op," "+op+" ");
		}
		String[] spl = str.split(" ");
		Stack st = new Stack();

		for(int i=0;i<spl.length;i++) {
			st.push(spl[i]);
		}

		System.out.println("Popping the values");
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

	private static void reverseEquation1(String s) {
		String[] operators = {"\\+", "-", "\\*", "/"};

		for (String op : operators) {
			s = s.replaceAll(op, " " + op + " ");
		}

		String[] splitted = s.split(" ");

		for (int i = splitted.length - 1; i >= 0; i--) {
			System.out.print(splitted[i]);
		}
	} 

}
