package com.jdk8.features.optional;
@FunctionalInterface
interface say1{
	public void say1(String msg);
	//abstract void say3();
}

@FunctionalInterface
interface say2 extends say1{
	default void say2(String msg) {
		
	}
}
public class Functionalnterface implements say1{
	public static void main(String[] args) {
		Functionalnterface f = new Functionalnterface();
		f.say1("ehlloo");
	}

	@Override
	public void say1(String msg) {
		System.out.println(msg);
		
	}
}
