package com.string;

public class ReverseTheStringOrder {
	public static void main(String[] args) {
		String str = "Welcome in Satish";
		resverse(str);
		
	}

	private static void resverse(String str) {
		 char[] inputArray = str.toCharArray(); 
	        char[] result = new char[inputArray.length]; 
	  
	        // Mark spaces in result 
	        for (int i = 0; i < inputArray.length; i++) { 
	            if (inputArray[i] == ' ') { 
	                result[i] = ' '; 
	            } 
	        } 
	  
	        // Traverse input string from beginning 
	        // and put characters in result from end 
	        int j = result.length - 1; 
	 
	        for (int i = 0; i < inputArray.length; i++) { 
	  
	            // Ignore spaces in input string 
	            if (inputArray[i] != ' ') { 
	  
	                // ignore spaces in result. 
	                if (result[j] == ' ') { 
	                    j--; 
	                } 
	                result[j] = inputArray[i]; 
	                j--; 
	            } 
	        } 
	        System.out.println(String.valueOf(result)); 

	
	}
		
	
}
