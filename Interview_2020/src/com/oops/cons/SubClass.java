package com.oops.cons;

public class SubClass extends SuperClas{
	SubClass(){
		this(1);
		System.out.println("Sub class no-args constructor");
	}
	SubClass(int x){
		this("Constructor chaining");
		System.out.println("Sub class Integer args constructor");
	}
	SubClass(String str){
		//here by default super() call be there so , it will call super class constructor
		System.out.println("Sub class String args constructor");
	}
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		
	}
}
