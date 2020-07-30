package com.jdk8.features.functinInterface;
interface Lion{
	default void eat() {
		System.out.println("Loin is eating()");
	}
}
interface Cow{
	default void eat() {
		System.out.println("Cow is eating()");
	}
}

public class Animal implements Lion,Cow{

	@Override
	public void eat() {
		Cow.super.eat();
		Lion.super.eat();
	}
	public static void main(String[] args) {
		Animal an = new Animal();
		an.eat();
	}
}
