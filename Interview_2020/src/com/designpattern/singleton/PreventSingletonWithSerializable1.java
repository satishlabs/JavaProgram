package com.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class PreventSingletonWithSerializable1 {
	public static void main(String[] args) {
		try {
			SingletonWithReadResolve instance1 = SingletonWithReadResolve.instance;
			
			//Serialization
			FileOutputStream fos = new FileOutputStream("E://File//Serializable");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			oos.close();
			
			//De-Serialization
			FileInputStream fis = new FileInputStream("E://File//Serializable");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SingletonWithReadResolve instance2 = (SingletonWithReadResolve)ois.readObject();
			ois.close();
			
			System.out.println("instacne1.hashCode: "+instance1.hashCode());
			System.out.println("instacne2.hashcode: "+instance2.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
