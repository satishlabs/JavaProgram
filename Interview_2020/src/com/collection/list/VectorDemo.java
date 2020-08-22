package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//Vector class is one of the implementation class of List interface which follows
		//duplicate element and insertion order and by default it is synchronized in nature.

		//By default every methods of Vector class is synchronized so we can say Vector is thread safe.

		//Initial size of Vector is 10.

		//Load factor of Vector is 100%
		
		Vector v=new Vector();
		v.add("Vikash");
		v.add("Vicky");
		v.add("Yogesh");
		v.add("Anish");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
                   System.out.println(itr.next());
		}
	}
}
