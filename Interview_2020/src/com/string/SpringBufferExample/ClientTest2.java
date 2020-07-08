package com.string.SpringBufferExample;

public class ClientTest2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("This").append(" is").append(" Number ").append(10).append(" and ").append(200.27);
		System.out.println("After append sb-- "+sb.toString());
		System.out.println("After append sb1-- "+sb1.toString());
		
		if(sb == sb1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String str = new String("Hello ");
		String str1 = str.concat("This").concat(" is");
		System.out.println(str +" : "+str1);
		if(str == str1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
