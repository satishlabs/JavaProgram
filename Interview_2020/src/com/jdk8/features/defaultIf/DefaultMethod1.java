package com.jdk8.features.defaultIf;
interface Sayable{
	
	//default method
	default void say() {
		System.out.println("Hello, this is default method");
	}
	
	//Abstract method
	void sayMore(String msg);
}
public class DefaultMethod1 implements Sayable{

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethod1 dm = new DefaultMethod1();
		dm.say();
		dm.sayMore("Work is worship");
	}

}
