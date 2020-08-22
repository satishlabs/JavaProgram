package com.serialization.scenario3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
 3. When requirement is to serialize superclass but not to subclass (Custom Serialization).

In order to prevent subclass from serialization we need to implement writeObject() and 
readObject() methods which are executed by JVM during serialization and 
deserialization also NotSerializableException is made to be thrown from 
these methods.We can also provide our custom logic in these methods which would 
be executed during serialization/deserializatin. 
*/


public class TestSerialization {
	public static void main(String[] args) {
		B obj = new B(10,20);
		try {
			FileOutputStream fos = new FileOutputStream("E:/File/TestWS.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			System.out.println("Serialization Done!!");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
