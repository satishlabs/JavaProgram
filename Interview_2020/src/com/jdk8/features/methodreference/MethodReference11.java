package com.jdk8.features.methodreference;
interface sayable11{
	void say11();
}
public class MethodReference11 {
	public static void saysomething() {
		System.out.println("Hello this is static method");
	}
	
	public static void main(String[] args) {
		sayable11 sayable11 = MethodReference11::saysomething;
		sayable11.say11();
	}
}
