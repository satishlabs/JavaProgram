package com.enumm;

public class EnumExample1 {
	enum Session{ SPRING,WINTER,SUMMER,FALL }
	public static void main(String[] args) {
		for(Session s: Session.values()) {
			System.out.println(s);
		}
		System.out.println("Value of WINTER is:  "+Session.valueOf("WINTER"));
		System.out.println("Index of WINTER is:  "+Session.valueOf("WINTER").ordinal());
		System.out.println("Index of WINTER is:  "+Session.valueOf("FALL").ordinal());
	}
}
