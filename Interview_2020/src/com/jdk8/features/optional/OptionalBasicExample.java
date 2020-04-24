package com.jdk8.features.optional;

import java.util.Optional;

public class OptionalBasicExample {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		String answer1="Yes";
		String answer2 =null;
		
		System.out.println("Non-empty Optional :"+gender);
		System.out.println(gender.isPresent()+" "+gender.empty());
		System.out.println("Non-empty optionl: Gender value: "+gender.get());
		
		System.out.println("Empty Optional: "+Optional.empty());
		
		System.out.println("ofNullable on Non-empty Optional: "+Optional.ofNullable(answer1));
		System.out.println("ofNullabel on empty Optional: "+Optional.ofNullable(answer2));
		
		//java.lang.NullPointerException
		System.out.println("ofNullable on Non-Empty Optional: "+Optional.of(answer2));
	}
}
