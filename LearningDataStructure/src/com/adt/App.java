package com.adt;

public class App {
	public static void main(String[] args) {
		Counter myConuter = new Counter("myCounter");
		myConuter.increment();
		myConuter.increment();
		myConuter.increment();
		myConuter.increment();
		
		System.out.println(myConuter.getCurrentValue());
	}
}
