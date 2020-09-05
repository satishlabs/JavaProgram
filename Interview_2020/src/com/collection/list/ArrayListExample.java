package com.collection.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// creates array with initial capacity of 10.
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

        copyOnWriteArrayList.add("ind");
        copyOnWriteArrayList.add("america");
        
     // fail-safe
        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
               copyOnWriteArrayList.add("newEle1");
               System.out.println(iterator.next());
        }

        for (String string : copyOnWriteArrayList) {
               System.out.println(string);
        }
        System.out.println("-------------------------------------");
     // fail-safe
        ListIterator<String> listIterator = copyOnWriteArrayList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               copyOnWriteArrayList.add("newEle2");
               System.out.println(listIterator.next());
        }
        
        System.out.println("-------------------------------------");
     // fail-safe
        Enumeration<String> listEnum = Collections
                     .enumeration(copyOnWriteArrayList);
        while (listEnum.hasMoreElements()) {
               copyOnWriteArrayList.add("newEle3");
               System.out.println(listEnum.nextElement());
        }
        
        //enhanced for loop is fail-safe
        for (String string : copyOnWriteArrayList) {
               copyOnWriteArrayList.add("newEle");
               System.out.println(string);
        }
	}
}
