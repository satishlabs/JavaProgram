package com.oops.generic;

/*
 In Generics accept any type of data according to requirements.
Suppose you want to perform a task with three different data types of parameters.
You want to show data of String, int, and float type. You must create three
 functions that accept different 
inputs and perform the same task.
 * */

public class ExampleWithGeneric {
	public static void main(String[] args) {
		ExampleWithGeneric obj = new ExampleWithGeneric();
		System.out.println("Calling by integer values");
		obj.showData(10,20);
		
		 System.out.println("Calling by String values");
	     obj.showData("Hello", "Java");
	     System.out.println("Calling by float values");
	     obj.showData(5.1f, 10.2f);
	}

	private <T> void showData(T a, T b) {
		System.out.println(a);
		System.out.println(b);
	}

	
}
