package com.ds.linkedlist.circular;

public class App {
	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(188);
		myList.insertFirst(58);
		myList.insertFirst(99);
		myList.insertFirst(88);
		
		myList.insertFirst(120);
		//myList.insertLast(100);
		myList.displayList();
	}
}
