package com.company.arisglobal;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("some() returns: "+some());
	}

	private static boolean some() {
		while(true) {
			try {
				return true;
			}finally {
				break;
			}
		}
		return false;
	}
}
