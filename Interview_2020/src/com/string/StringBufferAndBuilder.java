package com.string;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start time: "+ (System.currentTimeMillis() -startTime));
		
		StringBuffer sb = new StringBuffer("Java");
		for(int i=0;i<10000;i++) {
			sb.append("World");
		}
		System.out.println("Time taken by StringBuffer: "+ (System.currentTimeMillis()-startTime+"ms"));
		
		StringBuilder sb1 = new StringBuilder("Java");
		for(int i=0;i<10000;i++) {
			sb1.append("World");
		}
		System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis()-startTime+"ms"));
	}
}
