package com.adt;

public class App {
	public static void main(String[] args) {
		Counter myConuter = new Counter("myCounter");
		myConuter.increment();
		myConuter.increment();
		myConuter.increment();
		myConuter.increment();
		
		//We can access doSomething() method , because its private method inside counter class
		//myConuter.doSomething()
		
		System.out.println(myConuter.getCurrentValue());
	}
}
