package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestEmp {
	public static void main(String[] args) {
		Set empSet = new HashSet<>();
		Employee emp1 = new Employee("CC", "SE");
		Employee emp2 = new Employee("BB", "SE");
		
		empSet.add(emp1);
		empSet.add(emp2);
		
		/*Collections.sort(empSet,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});*/
		
		System.out.println(empSet);
		
		
		List empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		//Collections.sort(empList);
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println("jjjj0000000"+empList);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(2);
		list2.add(3);
		Collections.sort(list2);
		System.out.println("List2: @@@@   :"+list2);
		
System.out.println("-----------------------------------------------");
		int a[]={1,2,3,4,5,6,7,8,9,11}; 
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print("\t"+a[i]);
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		String s="/'ABC'/ ";
		System.out.println(s);
	}
}
