package com.oops.defineobject.four;
//Defining  object of a class as the return data type of the method.
public class Singleton {
	static Singleton obj;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(obj != null) {
			return obj;
		}else{
			obj = new Singleton();
			return obj;
		}
	}
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
