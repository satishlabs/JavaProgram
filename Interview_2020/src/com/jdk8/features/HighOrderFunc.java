package com.jdk8.features;

import java.util.function.Function;

public class HighOrderFunc {
	public static void main(String[] args) {
		Function<Integer, Integer> inc = e->e+1;
		doSum(5,inc);
	}

	public static void doSum(int value, Function<Integer, Integer> func) {
		System.out.println(func.apply(value));
	}
}
