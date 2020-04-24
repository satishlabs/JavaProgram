package com.program;

import java.lang.reflect.Field;

class BB{
	private int x=10;
}
public class AccessPrivateVariable {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field f = BB.class.getDeclaredField("x");
		f.setAccessible(true);
		int a = f.getInt(new BB());
		System.out.println(a);
	}
}
