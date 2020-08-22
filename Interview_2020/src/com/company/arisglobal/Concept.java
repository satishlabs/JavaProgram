package com.company.arisglobal;

import java.util.ArrayList;

public class Concept {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		
		a.add(8);
		a.add(6);
		a.add(3);
		
		ArrayList b = new ArrayList<>();
		
		b = (ArrayList) a.clone();
		
		//System.out.println(a);
		//System.out.println(b);
		
		b.add(2);
		b.remove(2);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("B is equal to A, its: "+ b.equals(a));
	}
}
