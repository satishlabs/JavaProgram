package com.company.smiths;

import java.util.PriorityQueue;

public class Prioprities {
	public static void main(String[] args) {
		PriorityQueue toDo = new PriorityQueue();
		toDo.add("dishes");
		toDo.add("laundry");
		toDo.add("bills");
		toDo.offer("bills");
		
		System.out.println(toDo.size()+" "+toDo.poll());
		System.out.println(" "+ toDo.peek()+" "+ toDo.poll());
		System.out.println(" "+toDo.poll()+" "+toDo.poll());
	}
}
