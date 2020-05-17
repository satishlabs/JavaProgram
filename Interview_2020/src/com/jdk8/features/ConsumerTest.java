package com.jdk8.features;

import java.util.function.Consumer;

//Consumer is a functional interface added in Java 8 that 
//has a single abstract method accept().

//A Consumer is used when you want to do perform an operation 
//that takes a parameter but doesn’t return anything.


public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		print.accept("abc");
	}
}
