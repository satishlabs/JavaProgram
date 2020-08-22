package com.oops.immutable;

public class ImmutableDemo {
	public static void main(String[] args) {
		
		User user = new User("Satish", "Prasad", new Address("RR", "Banglore"));
		Address add = user.getAddress();
		add.setLcoality("BB");
		add.setCity("Ranchi");
		System.out.println(user);
		
		if(user.address.equals(user.getAddress())){
			System.out.println("True");
		}
	}
}
