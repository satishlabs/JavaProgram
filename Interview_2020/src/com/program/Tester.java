package com.program;

class SuperClass{
	static void display(){
		System.out.println("SuperClass.display");
	}
	void display(int a){
		System.out.println("SuperClass.display(int): "+a);
	}
}
class SubClass extends SuperClass{
	static void display(){
		System.out.println("SubClass.display");
	}
	/*void display(int a){
		System.out.println("SubClass.display(int): "+a);
	}*/
}

public class Tester {
 public static void main(String[] args) {
	SuperClass obj = new SubClass();
	obj.display();
	obj.display(5);
 }
}
