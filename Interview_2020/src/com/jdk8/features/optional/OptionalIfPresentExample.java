package com.jdk8.features.optional;

import java.util.Optional;

//Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.

//Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false

public class OptionalIfPresentExample {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		
		if(gender.isPresent()) {
			System.out.println("Value is available");
		}else {
			System.out.println("Value not avaiable");
		}
		
		gender.ifPresent(g->System.out.println("In gender Option, value available."));
		
		gender.ifPresent(g->System.out.println("In emptyGender option,value available"));
	}
}
