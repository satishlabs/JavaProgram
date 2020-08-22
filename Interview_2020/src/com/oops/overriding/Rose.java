package com.oops.overriding;

import java.io.IOException;
//Can you identify how many errors are in the below snippet code? : Two
public class Rose {
	protected void color(char r) {
		System.out.println("Red");
	}
}

public class Marigold extends Rose{
	Override
	public color(char m) throws NullPointerException {
		System.out.println("Orange");
	}
}
 
public class Sunflower extends Marigold{
	@Override
	protected final void color(char s) throws IOException {
		System.out.println("Yellow");
	}
}