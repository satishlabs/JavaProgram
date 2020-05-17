package com.jdk8.features;

import java.time.LocalDate;
import java.util.function.Supplier;

//Supplier is a functional interface with a single abstract method get().

//A Supplier is used when you want to generate instances without taking any input.

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<LocalDate> sl = LocalDate::now;
		System.out.println(sl.get());
	}
}
