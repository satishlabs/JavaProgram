package com.oops;
class SuperClass{
	public void methodOfSuperClass(){
		System.out.println("From Super class");
	}
}
class SubClass extends SuperClass{
	public void methodOfSuperClass(){
		System.out.println("From Sub class");
	}
}
public class D {
	public static void util(SuperClass superClass){
		superClass.methodOfSuperClass();
	}
	public static void main(String[] args) {
		SuperClass superclass1 = new SuperClass();
        SubClass subclass = new SubClass();
        SuperClass superclass2 = new SubClass();
 
        util(superclass1);  //SuperClass object is passes to util()
        util(subclass);     //SubClass object is passed to util()
        util(superclass2); //SubClass object is passed to util()

	}
}
