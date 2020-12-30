package com.jdk8.features.functinInterface;
interface Doable1{
	default void doIt() {
		System.out.println("Do it now");
	}
}
@FunctionalInterface
interface Sayable11 extends Doable1{
	void say(String msg); //abstract method
}

public class FunctionalInterfaceExample3 implements Sayable11{

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample3 f3 = new FunctionalInterfaceExample3();
		f3.say("Hello there!");
		f3.doIt();
	}
	
}
