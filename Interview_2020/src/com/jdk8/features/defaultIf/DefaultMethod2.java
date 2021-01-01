package com.jdk8.features.defaultIf;
interface Sayable1{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg);
	
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}
public class DefaultMethod2 implements Sayable1{

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethod2 dm = new DefaultMethod2();
		dm.say(); //calling default method
		dm.sayMore("Work is worship"); //calling abstract method
		Sayable1.sayLouder("Hellooooo.....");//calling static method
	}

}
