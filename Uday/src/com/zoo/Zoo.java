package com.zoo;

public class Zoo {
	public static void main(String[] args) {
		Animal animal1 = new Animal(20, "F", 50);
		
		animal1.eat();
		
		Bird bird1 = new Bird();
		bird1.fly();
		
		
		Fish fish1 = new Fish();
		fish1.swim();
	}
}	
