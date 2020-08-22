package com.oops;
class Parent2{
	public void display(int i) {
		System.out.println("Parent");
	}
}
public class Child2 extends Parent2{
	public void display(int i) {
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.display(5);
	}
}
