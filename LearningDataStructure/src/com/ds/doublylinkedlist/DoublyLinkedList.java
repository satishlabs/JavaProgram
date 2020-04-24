package com.ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node new_node = new Node();
		new_node.data = data;
		
		if(isEmpty()) {
			last = new_node; //if empty ,last will refer to new Node being created
		}else {
			first.previous = new_node; 
		}
		new_node.next = first; //the new node's next field with point to the old first
		this.first = new_node;
	}
	
	public void insertLast(int data) {
		Node new_node = new Node();
		new_node.data = data;
		
		if(isEmpty()) {
			first = new_node;
		}else {
			last.next = new_node; //assigning old last to new_node
			new_node.previous = last; // the old last will be the new_node previous 
		}
		last = new_node; //the linkedlist's last field should point to the new_node
	}
	
	//assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) { //there is only one item in the list
			last = null;
		}else {
			first.next.previous =null; //the list's first node will point to  null;
		}
		first = first.next; //we are assigning the reference ot the node following the old first node the linkedlist
		return temp; // return the deleted old first node
	}
	
	//assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) { //we only have one node in the list
			first = null;
		}else {
			last.previous.next = null; //the last node's previous next field will point to null
		}
		last = last.previous;
		return temp;
	}
	
	//assume a npn-empty list
	public boolean insertAfter(int key,int data) {
		Node current = first; //we start from the beginning of the list
		while(current.data != key) { // as long as we have not found the key in a particular node
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		if(current == last) {
			current.next  = null;
			last = newNode;
		}else {
			newNode.next = current.next; //new node's next field should point to the node ahead of the current one
			current.next.previous = newNode; //the node ahead of current ,its previous field should point to the new node
		}
		newNode.previous = current;
		current.next = newNode;
		return true;
	}
	
	//assume a non-empty list
	public Node deleteKey(int key) {
		Node current = first; //wer start from the beginning
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next;//make the first field point to the node following current since current will be deleted
		}else {
			current.previous.next = current.next;
		}
		if(current == last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		return current;
		
	}
	
	public void displayForward() {
		System.out.println("List (first -->last): ");
		Node current = first;//start from the begining 
		while(current != null) {
			current.display(); //call the display method of the node
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("List (last --> first): ");
		Node current = last; //start from the end
		while(current != null) {
			current.display();
			current = current.previous;
		}
		System.out.println();
	}
}
