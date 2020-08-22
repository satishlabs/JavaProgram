package com.serialization.scenario3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

public class TestDeSerialization {
	public static void main(String[] args) {
		B obj = new B(10,20);
		try {
			FileInputStream fis = new FileInputStream("E:/File/TestWS.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = (B) ois.readObject();
			ois.close();
			System.out.println("DeSerialization Done");
			System.out.println("And Value: ");
			System.out.println("value of i is : " + obj.i + " & value of j is : " + obj.j);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	// implementing readObject method,   
	
}
