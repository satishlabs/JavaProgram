package com.jdk8.features.methodreference;

import java.util.function.BiFunction;

class Arithmetic1{
	public static int add(int a,int b) {
		return a+b;
	}

	/*
	 * public static int add(int a,float b) { return (int) (a+b); }
	 */
	public static float add(int a,float b) {
		return a+b;
	}
	public static float add(float a,float b) {
		return a+b;
	}
}
public class MethodReference44 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic1::add;
		int result1 = adder1.apply(10, 20);
		System.out.println(result1);
		
		BiFunction<Integer, Float, Float> adder2 = Arithmetic1::add;
		Float result2 = adder2.apply(10, 20.9f);
		System.out.println(result2);
		
		BiFunction<Float, Float, Float> adder3 = Arithmetic1::add;
		Float result3 = adder3.apply(10.0f, 20.5f);
		System.out.println(result3);
	}
}
