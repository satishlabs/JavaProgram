package com.program;

public class Test2 {
		public static void main(String[] args) {
			String str ="Prasadpd";
			
			char[] strArrray = str.toCharArray(); 
			int n = strArrray.length;
			char strArray1;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(strArrray[i]==strArrray[j]) {
						strArray1 = strArrray[i];
						System.out.println(strArray1);
						
						StringBuffer sb = new StringBuffer();
					}
				}
				
			}
		}
}
