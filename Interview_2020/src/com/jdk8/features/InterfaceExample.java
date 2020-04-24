package com.jdk8.features;
interface MyInterface{
	public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface");
	   }
}
public class InterfaceExample implements MyInterface{
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.display();
	}
}
