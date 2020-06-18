package com.arrays;

import java.util.Arrays;

public class CheckParenthesis {
	public static void main(String[] args) {
		char[] expr = "([()])".toCharArray();
		int n = expr.length;
		if(checkParenthesis(expr,n)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
	 static char findClosing(char c) {
		 if(c == '(')
			 return ')';
		 if(c == '{')
			 return '}';
		 if(c == '[')
			 return ']';
		return Character.MIN_VALUE;
	}
	private static boolean checkParenthesis(char[] expr, int n) {
		//Base case
		if(n == 0)
			return true;
		if(n == 1)
			return false;
		if(expr[0] == ')' || expr[0]=='}' ||expr[0] ==']')
		   return false;
		  // Search for closing bracket for first 
        // opening bracket. 
		char closing = findClosing(expr[0]);
		
		// count is used to handle cases like 
        // "((()))". We basically need to 
        // consider matching closing bracket. 
		int i, count=0;
		for(i=1; i<n; i++) {
			if(expr[i] == expr[0])
				count++;
			if(expr[i] == closing) {
				if(count ==0)
					break;
				count--;
			}
		}
		 // If we did not find a closing 
        // bracket 
		if(i == n)
			return false;
		// If closing bracket was next 
        // to open 
		if(i == 1)
			return checkParenthesis(Arrays.copyOfRange(expr, i+1, n), n-2);
		// If closing bracket was somewhere 
        // in middle.
        return checkParenthesis(Arrays.copyOfRange(expr, 1, n), i - 1) && checkParenthesis(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1); 
	}

	
}
