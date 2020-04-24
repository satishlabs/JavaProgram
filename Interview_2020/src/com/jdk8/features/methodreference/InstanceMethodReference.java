package com.jdk8.features.methodreference;
interface sayable1{
	void say();
}

public class InstanceMethodReference {
	public void saySomething() {
		System.out.println("Hello,this is Non-static method");
	}
	public static void main(String[] args) {
		InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
		// Referring non-static method using reference  
		sayable1 say = methodReference::saySomething;
		// Calling interface method  
		say.say();
		
		  // Referring non-static method using anonymous object  
		sayable1 say2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
		 // Calling interface method  
		say2.say();
	}
}
