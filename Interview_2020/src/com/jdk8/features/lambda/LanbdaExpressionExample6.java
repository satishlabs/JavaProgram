package com.jdk8.features.lambda;

public class LanbdaExpressionExample6 {
	public static void main(String[] args) {
		
		//Lambda expression without return keyword
		Addable ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(13, 12));
		
		//Lamnda expression with return keyword
		Addable ad2 =(int a,int b)->{
			return(a+b);
		};
		System.out.println(ad2.add(120, 130));
	}
}
