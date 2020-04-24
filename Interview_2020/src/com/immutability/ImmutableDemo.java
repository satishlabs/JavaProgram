package com.immutability;

public class ImmutableDemo {
	public static void main(String[] args) {
		User u = new User("Satish", "Prasad", new Address("#572 15B Cross", "Channsadnra", "Bangalore"));
		Address address = u.getAddress();
		System.out.println(address);
		//System.out.println(u);
		address.setFirstLine("#500 10B Cross");
		address.setSecondLine("Dwarakanagar");
		address.setCity("Blore");
		System.out.println(u.getAddress());
	}
}
