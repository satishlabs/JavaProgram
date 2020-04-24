package com.jdk8.features;
interface Drawable{
	void draw();
}
public class WithOutLambda1 {
	public static void main(String[] args) {
		int d=10;
		Drawable drawable = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("drawable: "+d);
				
			}
		};
		drawable.draw();
	}
}
