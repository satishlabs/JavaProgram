package com.oops.cons;

public class SuperClas {

	public SuperClas() {
		this(1);
		System.out.println("Super class constructor");
	}
	SuperClas(int x){
		this(1,"constructor chaining");
		System.out.println("Super class One args constructor");
	}
	SuperClas(int x, String str){
		System.out.println("Super class Two arsg constructor");
	}
}
