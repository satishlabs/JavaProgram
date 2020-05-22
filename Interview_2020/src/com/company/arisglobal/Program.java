package com.company.arisglobal;

public class Program {
	int x = 12;
	
	public static void main(String[] args) {
		Program p = new Program();
		p.method(5);
		System.out.println(p.x);
	}

	public void method(int x) {
		x+=x;
		System.out.println(x);
		
	}
}
