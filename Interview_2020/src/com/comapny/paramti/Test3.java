package com.comapny.paramti;

public class Test3 {
	public static void main(String[] args) {
		int[]a = {1};
		Test3 t = new Test3();
		t.increment(a);
		System.out.println(a[a.length-1]);
	}

	private void increment(int[] a) {
		a[a.length-1]++;
		
	}
	
	
}

class B{
	int b;
	public abstract void add();
	public B(int x):b(x){
		
	}
}


