package com.jdk8.features.methodreference;

public class InstanceMethodReference2 {
  public void printMsg() {
	  System.out.println("Hello, this is instance method");
  }
  public static void main(String[] args) {
	Thread t1 = new Thread(new InstanceMethodReference2()::printMsg);
	t1.start();
}
}
