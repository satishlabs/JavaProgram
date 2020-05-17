package com.jdk8.features.stream;

import java.util.stream.IntStream;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		 final long primeCount = IntStream.range(1, 100)
	                .parallel()
	                .filter(number -> isPrime(number)).count();
	}

	public static Object isPrime(final int number) {
		
		return number >1 && IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(divisor -> number % divisor ==0);
	}
}
