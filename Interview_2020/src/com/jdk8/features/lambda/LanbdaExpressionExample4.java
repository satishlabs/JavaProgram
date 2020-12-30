package com.jdk8.features.lambda;
interface Sayable1{
	public String say(String name);
}
public class LanbdaExpressionExample4 {
	public static void main(String[] args) {
		
		//Lambda Expression with single parameter
		Sayable1 s1 = (name)->{
			return "Hello, " +name;
		};
		System.out.println(s1.say("Satish"));
		
		
		//You can omit function parentheses
		
		Sayable1 s2 = name->{
			return "Hello, "+name;
		};
		System.out.println(s2.say("Manish"));
		
		Sayable1 s3 = name->(name);
		System.out.println(s3.say("Hello, "+"Ramesh"));
	}
}
