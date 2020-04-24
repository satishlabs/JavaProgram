package com.jdk8.features;
@FunctionalInterface
interface sayable{
	public void say(String msg);
	//public void say1(String msg);
	
	default void method1() {
		System.out.println("mwthod1");
	}
	default void method2() {
		System.out.println("method2");
	}
}
public class FunctionalInterfaceExample3 implements sayable{

	@Override
	public void say(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample3 fucn = new FunctionalInterfaceExample3();
		fucn.say("Hello How are you");
		fucn.method1();
		fucn.method2();
	}

}
