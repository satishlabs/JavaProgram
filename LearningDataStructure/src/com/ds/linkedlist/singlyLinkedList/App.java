package com.ds.linkedlist.singlyLinkedList;

public class App {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(1);
		list.insert(3);
		
		list.insert(9);
		
		list.insert(5);
		list.insert(8);
		
		//list.displayList();
		
		list.deleteFirst();
		
		list.displayList();
	}
}
