package com.jdk8.features.lambda;
interface Sayable{
	public String say();
}
public class LanbdaExpressionExample3 {
	public static void main(String[] args) {
		Sayable s = ()->{
			return "I have nothing to say";
		};
		System.out.println(s.say());
	}
}
