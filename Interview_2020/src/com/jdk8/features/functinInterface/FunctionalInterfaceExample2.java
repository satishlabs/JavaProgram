package com.jdk8.features.functinInterface;
interface sayable1{
	void say(String msg); //abstract method
	
	//it can contain any number of Object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceExample2 implements sayable1{

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample2 f2 = new FunctionalInterfaceExample2();
		f2.say("Hello there !");
	}
}
