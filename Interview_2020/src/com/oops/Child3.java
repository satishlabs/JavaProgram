package com.oops;
class Parent3{
	public Parent3() {
		System.out.println("parent Constructor");
	}
}
public class Child3 extends Parent3{
	Child3(int i){
		System.out.println("Child Construcotr");
	}
	
	public static void main(String[] args) {
		Parent3 p = new Child3(3);
	}
}
