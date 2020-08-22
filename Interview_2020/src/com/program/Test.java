package com.program;

import java.util.HashSet;
import java.util.Set;



public class Test {
	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<Emp>();
		empSet.add(new Emp(1, "Satish"));
		empSet.add(new Emp(1, "Satish"));
		
		System.out.println(empSet);
		
		Test t = new Test();
		System.out.println(t.Test(10));
		System.out.println(t.Test('A'));
		System.out.println(t.Test('c'));
		
	}
	public int Test(int a,int b) {
		return a+b;
	}
	public double Test(double b) {
		return b;
		
	}
	public float Test(float c) {
		return c;
	}
}
