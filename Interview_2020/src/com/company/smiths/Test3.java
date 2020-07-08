package com.company.smiths;

public class Test3 {
	public static void main(String[] args) {
		int[] a = {1};
		Test3 t = new Test3();
		t.increment(a);
		System.out.println(a[a.length - 1]);
	}

	 void increment(int[] i) {
		i[i.length - 1]++;
		 
	}
}
