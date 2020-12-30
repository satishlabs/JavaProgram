package com.jdk8.features.lambda;
@FunctionalInterface
interface Drawable1{
	public void draw();
}
public class LanbdaExpressionExample2 {
	public static void main(String[] args) {
		int width=10;
		
		Drawable1 d =()->{
			System.out.println("Width: "+width);
		};
		d.draw();
	}
}
