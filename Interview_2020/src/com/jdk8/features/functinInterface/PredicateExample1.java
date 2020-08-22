package com.jdk8.features.functinInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//A Predicate is a statement that may be true or false depending on the values of its variables.
//In Java 8, Predicate is a functional interface that can be used anywhere we need to evaluate a boolean condition.
//It takes an object as argument and returns true or false depending on some condition.

//Predicate contains 5 methods and they are:-

//1) test()
//2) and()
//3) or()
//4) negate()
//5) isEqual()

public class PredicateExample1 {
	public static void main(String[] args) {
		Predicate<Integer> p = n->n%2==0;
		System.out.println("8 is Even: "+p.test(8));
		System.out.println("5 is Even: "+p.test(5));
		System.out.println(p.test(2));
		
		System.out.println();
		
		Predicate<Integer> p1 = n->n%2 == 0;
		Predicate<Integer> p2 = n->n%3 == 0;
		Predicate<Integer> p3 = p1.and(p1);
		List<Integer> ls = Arrays.asList(24,10,15,18,1,6,12,11);
		System.out.println("Multiples of 2");
		apply(p1,ls);
		System.out.println("Multiples of 3");
		apply(p2, ls);
		System.out.println("Multiples of 2 and 3");
		apply(p3, ls);
	}

	private static void apply(Predicate<Integer> p, List<Integer> ls) {
		for(Integer i : ls) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("==============================");
		Predicate<String> p4 = Predicate.isEqual("Satish");
		System.out.println(p4.test("Satish"));
		System.out.println(p4.test("Prasad"));
		
	}
	
	
}
