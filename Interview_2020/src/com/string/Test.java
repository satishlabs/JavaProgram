package com.string;

public class Test {
	public static void main(String[] args) {
		String str="Satish";
		String str1 = "AB";
		 System.out.println(str1.hashCode());
		char arr[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			int x = i%2;
			if(x!=0){
				sb.append("*");
			}else{
				sb.append(arr[i]);
			}
		}
		System.out.println("Name: "+sb.toString());
	}
}
