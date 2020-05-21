package com.ds.stack;

import java.util.Stack;
/**
Input: (()()
Output: 4
Valid parenthesis string is ()(), length is 4

Input: (((
Output: 0
No valid balanced parenthesis found.

Input: (())()
Output: 6
Complete string has balanced parenthesis. length=6

Input: ())(()
Output: 2
Balanced parenthesis is () at two occurrence, so max length is 2.

*/

public class LongestBalancedParenthesis {
	public static void main(String[] args) {
		String str = "())(()";
		System.out.println(getLongestValidParenthesesLength(str));
	}

	private static int getLongestValidParenthesesLength(String str) {
			Stack<Integer> indexes= new Stack<>();
			indexes.push(-1);
			
			int maxParenthesisSubstringLength =0;
			int i=0;
			while(i < str.length()) {
				if(str.charAt(i) == '(') {
					indexes.push(i);
				}else {
					indexes.pop(); 

					if(!indexes.isEmpty()) {
						maxParenthesisSubstringLength = Math.max(maxParenthesisSubstringLength, i-indexes.peek());
					}else {
						indexes.push(i);
					}
				}
				i++;
			}
		return maxParenthesisSubstringLength;
	}
}
