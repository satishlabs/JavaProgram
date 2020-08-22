package com.string;

public class Test3 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=s1;
		String s4 = new String("Hello");
		
		String s9= s2.intern();
		System.out.println("Intern : "+(s9==s4));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s3));
		System.out.println(s2==s3);
		
		System.out.println(s3==s4);
		System.out.println(s1.equals(s4));
		
		String s5= new String("Hello World");
		String s6 = new String("Hello World");
		
		System.out.println(s5.equals(s6));
		System.out.println(s5 == s6);
		
		String s7= s1.concat(" "+"World");
		System.out.println("S7: "+s7);
		
		
		System.out.println(s5.equals(s7));
		System.out.println(s6==s7);
	}
}
