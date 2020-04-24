package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			//list.add(15);
			System.out.println(itr.next());
		}
		System.out.println("-----------List--------------");
		list.forEach(l->System.out.println(l));
		
		List<User> uList = new ArrayList<>();
		User user = new User();
		user.setId(1);
		user.setName("Satish");
		user.setAge(25);
		
		User user1 = new User();
		user1.setId(2);
		user1.setName("Ms Dhoni");
		user1.setAge(35);
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("Ms Dhoni");
		user2.setAge(32);
		
		uList.add(user);
		uList.add(user1);
		uList.add(user2);
		
		uList.forEach(userl->System.out.println(userl.getId()+" "+userl.getName()+" "+userl.getAge()));
		System.out.println("================================");
		uList.stream().filter(usr->{
			//System.out.println(usr);
			return usr.getAge()>30;
		}).forEach(usr->{
			System.out.println(usr);
		});
		
		uList.stream().filter(usrl->usrl.getAge()>30).count();
		/*
		 * uList.forEach(usr ->{ System.out.println(usr.getId());
		 * System.out.println(usr.getName()); });
		 */
	}
}
