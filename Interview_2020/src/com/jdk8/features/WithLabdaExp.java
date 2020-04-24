package com.jdk8.features;

@FunctionalInterface
interface Drawable1{
	void draw();
}

public class WithLabdaExp {
	public static void main(String[] args) {
		int width=10;
		
		Drawable1 d = ()->{
			System.out.println("Drawaing: "+width);
		};
		d.draw();
	}
}
