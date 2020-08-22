package com.immutability;

public class AgeTest {
	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1993);
		
		ImmutableStudent stud = new ImmutableStudent(11, "Satish", age);
		System.out.println("Alex age year before modification = "+stud.getAge().getYear());
		
		age.setYear(2000);
		System.out.println("Alex age year after modification = "+stud.getAge().getYear());
	}
}
