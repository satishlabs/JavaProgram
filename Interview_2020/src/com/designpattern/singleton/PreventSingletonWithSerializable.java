package com.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class PreventSingletonWithSerializable {
	public static void main(String[] args) {
		try {
			SingletonWithSerializable instance1 = SingletonWithSerializable.getInstannce();
			
			//Serialization
			FileOutputStream fos = new FileOutputStream("E://File//Serializable");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			oos.close();
			
			//De-Serialization
			FileInputStream fis = new FileInputStream("E://File//Serializable");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SingletonWithSerializable instance2 = (SingletonWithSerializable)ois.readObject();
			ois.close();
			
			System.out.println("instacne1.hashCode: "+instance1.hashCode());
			System.out.println("instacne2.hashcode: "+instance2.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
