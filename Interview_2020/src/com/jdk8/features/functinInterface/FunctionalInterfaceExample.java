package com.jdk8.features.functinInterface;

@FunctionalInterface
interface sayable{
	public void say(String msg);
}
public class FunctionalInterfaceExample implements sayable{

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello There !");
	}
	
}
