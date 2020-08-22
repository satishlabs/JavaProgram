package com.string;

public class PatternMatch {
	public static void main(String[] args) {
		String str = "helloslkhellodjladfjhelloHELLO hehellollo";
		String findStr = "hello";
		int lastIndex =0;
		int count=0;
		while(lastIndex != -1){
			str = str.toLowerCase();
			lastIndex = str.indexOf(findStr, lastIndex);
			//System.out.println(lastIndex);
			 
			if(lastIndex != -1){
				count++;
				lastIndex+=findStr.length();
			}
		}
		System.out.println(findStr+" : "+count);
	}
}
