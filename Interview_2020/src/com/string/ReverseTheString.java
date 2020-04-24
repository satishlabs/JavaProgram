package com.string;

public class ReverseTheString {
	public static void main(String[] args) {
		String str="MyJava";
		
		//Using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Iterative way to reverse String
		
		char[] strArray = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(strArray[i]);
		}
		
		System.out.println(" ");
		
		//Recursive method to reverse String
		System.out.println(recurseiveWay(str));
		
		//System.out.println(str.substring(1, 0));
	}

	public static String recurseiveWay(String str) {
		if(null == str || (str.length()<=1)){
			return str;
		}
		return recurseiveWay(str.substring(1))+str.charAt(0);
	}
}
