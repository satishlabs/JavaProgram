package com.serialization.scenario4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SerializeEmployee {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(5);
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(6, 40);
		map.put(7, 50);
		
		MyClass object1 = new MyClass(list,set,map);
		try {
			FileOutputStream fos = new FileOutputStream("E:/File/FileOutputStream.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("Serialization process has started, serializing objects...");
			oos.writeObject(object1);
			oos.close();
			System.out.println("Object Serialization completed.");
		
		//DeSerialization process >
        
        
		FileInputStream fis=new FileInputStream("ser.txt");
		ObjectInputStream oin=new ObjectInputStream(fis);
        System.out.println("\nDeSerialization process has started, displaying objects...");
        MyClass object=(MyClass)oin.readObject();
        System.out.println(object);
        fis.close();
oin.close();
System.out.println("Object DeSerialization completed.");
        
 } catch (IOException | ClassNotFoundException  e) {
        e.printStackTrace();
 }
	}
}
