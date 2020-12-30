package com.jdk8.features.lambda;

public class LanbdaExpressionExample8 {
	public static void main(String[] args) {
		
		Sayable1 s1 = (message)->{
			String str1 = "I would like to say ";
			String str2 = str1+message;
			return str2;
		};
		
		System.out.println(s1.say("time is precious "));
	}
}
