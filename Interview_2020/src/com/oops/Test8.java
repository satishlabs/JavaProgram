package com.oops;

class Pet{
	public String getName() {
		return "pet";
	}
}
class Cat extends Pet{
	public String getName() {
		return "cat";
	}
}

class Shape{
	private String name;
	public Shape() {
		name="shape";
	}
	public String getName() {
		return name;
	}
}
class Ball extends Shape{
	private String name;
	public Ball() {
		name="ball";
	}
}

public class Test8 {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Ball ball = new Ball();
		System.out.println(pet.getName()+", "+ball.getName());
	}
}
