package com.oops.generic;

public class Student {
	public static void main(String[] args) {
		Example<Integer> example = new Example<>();
		example.setObj(1);
		//example.setObj("nn");   //Compile time error  
		
		System.out.println(example.getObj());
	}
}
/*
Output: Exception in thread “main” java.lang.Error: Unresolved compilation problem:
 The method add(String) is undefined for the type Example<Integer> at
  Student.main(Student.java:16)

 */