package com.immutability;

public class ImmutableDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		User1 u1 = new User1("Ms", "Dhoni", new ChildAddress("#572", "Mecon harmu", "Ranchi"));
		ChildAddress cAddress = u1.getCaddrress();
		System.out.println(cAddress);
		
		cAddress.setFirstLine("#560");
		cAddress.setSecondLine("TatiSilwai");
		cAddress.setCity("Chatra");
		
		System.out.println(cAddress);
	}
}
