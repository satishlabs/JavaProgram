package com.oops.generic;

public class Test<T1, T2> {
	T1 obj1;
	T2 obj2;
	
	public void setData(T1 object1, T2 object2) {
		obj1 = object1;
		obj2 = object2;
	}
	
	public void print() {
		System.out.println(obj1+" : "+ obj2);
	}
	
	public static void main(String[] args) {
		Test<String, Integer> test = new Test<>();
		test.setData("Satish", 123);
		test.print();
	}
}
