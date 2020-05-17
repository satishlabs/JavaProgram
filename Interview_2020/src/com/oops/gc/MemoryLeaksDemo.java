package com.oops.gc;

import java.util.Vector;

public class MemoryLeaksDemo {
	public static void main(String[] args) {
		 Vector v = new Vector(214444); 
	        Vector v1 = new Vector(214744444); 
	        Vector v2 = new Vector(214444); 
	        Vector v3 = new Vector(214444); 
	        Vector v4 = new Vector(214744444); 
	        Vector v5 = new Vector(214444); 
	        System.out.println("Memory Leaks"); 
	}
}
