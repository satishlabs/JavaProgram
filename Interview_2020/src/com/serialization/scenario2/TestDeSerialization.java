package com.serialization.scenario2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 When super class is not implementing serializable interface and subclass implements.
 When default constructor is present.
 
 Output:
default constructor called of parent class.
DeSerialization Done!!
Value is
value of i is : 0 & value of j is : 20


When default constructor is not present.
Exception in thread "main" java.io.InvalidClassException: B; B; no valid constructor

  */

public class TestDeSerialization {
	public static void main(String[] args) {
		B obj = new B(30,50);
		try {
			FileInputStream fis = new FileInputStream("E:/File/TestWS.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = (B) ois.readObject();
			ois.close();
			System.out.println("DeSerialization Done!!");
			System.out.println("Value is");
			System.out.println("value of i is : " + obj.i + " & value of j is : " + obj.j);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
