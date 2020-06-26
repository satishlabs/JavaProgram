package com.string;

public class Find4thUniqueChar {
	public static void main(String[] args) {
		String abc="Bangalore";
		//String[] str1=str.trim().split("");
		int t=4;
		 for(int i=0;i<abc.length();i++)
		    {
		        for(int j=i+1;j<abc.length();j++)
		        {
		            if(abc.charAt(i) ==abc.charAt(j))
		            	
		                abc=abc.replace(String.valueOf(abc.charAt(j))," ");
		        }
		    }   
		    System.out.println(abc);
		
	}
	
}
