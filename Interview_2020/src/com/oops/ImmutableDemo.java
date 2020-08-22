package com.oops;

import java.util.ArrayList;

public class ImmutableDemo {
	public static void main(String[] args) {
		ArrayList<Address> addressList = new ArrayList<Address>();
		addressList.add(new Address("AAA1", "AAA2", "Ranchi"));
		addressList.add(new Address("BB1", "BB2", "Bangalore"));
		
		User u = new User("Mk", "BK", addressList);
		System.out.println(u);
		
		ArrayList<Address> localAddress = u.getAddressList();
	}
}
