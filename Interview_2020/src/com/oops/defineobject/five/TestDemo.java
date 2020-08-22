package com.oops.defineobject.five;


//Defining object of a class as the static variable or class variable of another class
class Sample{
	public void display(String str) {
		System.out.println(str);
	}
}
public class TestDemo {
	public static Sample sample = new Sample();
	public static void main(String[] args) {
		TestDemo.sample.display("Hello Satish");
	}
}
