package com.array;

import java.util.Scanner;

public class SimpleCalculator {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // The result of the operation
	        int result = 0;

	        // The original input
	        System.out.print("Enter an expression to compute: ");
	        String userInput = input.nextLine();

	        // The tokens that make up the input
	        String[] tokens = userInput.split(" ");

	        // Determine the operator
	        switch (tokens[1].charAt(0)) {
	            case '+':
	                result = Integer.parseInt(tokens[0])
	                        + Integer.parseInt(tokens[2]);
	                break;
	            case '-':
	                result = Integer.parseInt(tokens[0])
	                        - Integer.parseInt(tokens[2]);
	                break;
	            case '*':
	                result = Integer.parseInt(tokens[0])
	                        * Integer.parseInt(tokens[2]);
	                break;
	            case '/':
	                result = Integer.parseInt(tokens[0])
	                        / Integer.parseInt(tokens[2]);
	        }

	        // Display result
	        System.out.println(tokens[0] + ' ' + tokens[1] + ' '
	                + tokens[2] + " = " + result);
	    }
}
