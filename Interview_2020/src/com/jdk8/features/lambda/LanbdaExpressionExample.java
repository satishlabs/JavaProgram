package com.jdk8.features.lambda;
interface Drawable{
	public void draw();
}
public class LanbdaExpressionExample {
	public static void main(String[] args) {
		int width=10;
		
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Width : "+width);
				
			}
		};
		d.draw();
	}
}
