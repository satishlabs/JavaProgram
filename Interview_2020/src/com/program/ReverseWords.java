package com.program;

public class ReverseWords {
	public static void main(String[] args) {
		String blogName = "how to do in java";
		StringBuilder reverseString = new StringBuilder();
		 
		
		// 1. way to reverse the Word in same position
		String[] words = blogName.split(" ");       //step 1
		 
		for (String word : words) 
		{
		    String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
		    reverseString.append(reverseWord + " ");                                //step 3
		}
		 
		System.out.println( reverseString.toString().trim() );
		
		//2. way 
		
		 
		//String reverseString1 = StringUtils.reverseDelimited( StringUtils.reverse(sentence), ' ' );
		 
	//	System.out.println( reverseString );
		
		System.out.println(reverseWord(blogName));
	}

	public static String reverseWord(String str) {
		String[] strArray = str.split(" ");
		String reverseWrods =" ";
		
        	for(int i=strArray.length-1;i>=0;i--) {
        		reverseWrods = reverseWrods+" "+strArray[i];
        	}
        	 //System.out.println("reverseWrods: "+reverseWrods+" ");
        

		
		return reverseWrods;
	}
}
