package com.string.SpringBufferExample;

public class ClientTest4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Test String");
		sb.reverse();
		System.out.println("reversed - "+sb.toString());
	}
}
