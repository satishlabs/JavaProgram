package com.exception;

import java.io.FileNotFoundException;
class A{
	public void printName() throws FileNotFoundException {
        System.out.println("Value-A");
    }
}
class B extends A{
	public void printName() throws NullPointerException {
        System.out.println("Name-B");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        A a = new B();
        a.printName();
    }
}
