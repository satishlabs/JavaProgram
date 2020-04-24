package com.jdk8.features;

import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String[] args) {
		String[] str = new String[5];
		str[2] ="Geeks Classes are coming soon";
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		System.out.println(value.get());
		
		System.out.println(value.hashCode());
		
		System.out.println(value.isPresent());
	}
}
