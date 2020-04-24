package com.string;

public class BufferBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.capacity());
		
		
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1.capacity());
	}
}
