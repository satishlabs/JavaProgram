package com.string.SpringBufferExample;

public class ClientTest3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("let");
		sb.insert(2, "n");
		System.out.println("After Insert : "+sb.toString()); //lent
	}
}
