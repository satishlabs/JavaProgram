package com.oops.immutable;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(111, "Satish", new Date());
		System.out.println(im);
		
		tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1=111;
		immutableField2="Test";
		mutableField.setDate(20);
		
	}

	/*
	 * private static void tryModification(Integer immutableField1, String
	 * immutableField2, Date mutableField) { immutableField1 = 10000;
	 * immutableField2 = "test changed"; mutableField.setDate(10);
	 * 
	 * }
	 */
}
