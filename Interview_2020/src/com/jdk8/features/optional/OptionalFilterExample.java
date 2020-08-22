package com.jdk8.features.optional;

import java.util.Optional;

public class OptionalFilterExample {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		//Optional<String> emptyGender1 = gender
		
		//Filter on Optuonal
		System.out.println(gender.filter(g->g.equals("male"))); //Optional.empty
		System.out.println(gender.filter(g->g.equalsIgnoreCase("MALE"))); //Optianl[MALE]
		System.out.println(emptyGender.filter(g->g.equalsIgnoreCase("MALE"))); //Optional.empty
	}
}
