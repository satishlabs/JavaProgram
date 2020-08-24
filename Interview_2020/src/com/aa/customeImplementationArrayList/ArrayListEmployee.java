package com.aa.customeImplementationArrayList;

public class ArrayListEmployee {
	public static void main(String[] args) {
		ArrayListCustom list = new ArrayListCustom();
		list.add(new Employee("1", "sam"));
		  list.add(new Employee("2", "amy"));
		     list.add(new Employee("3", "wil"));
		     list.add(new Employee("4", "cat"));
		     list.add(new Employee("1", "sam"));
		     list.add(new Employee("2", "amy"));
		     list.add(null);
		     
		     list.display();
		     
		     System.out.println("\nelement at index "+1+" = "+list.get(1));
		     System.out.println("element removed from index "+12+" = "+list.remove(2));
	}
}
