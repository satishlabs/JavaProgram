package com.ds.linkedlist.circular;

import com.ds.linkedlist.singlyLinkedList.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data){
		Node new_node = new Node();
		new_node.data = data;
		
		if(isEmpty()){
			last = new_node;
		}
		new_node.next = first;
		first = new_node;
	}
	
	public void insertLast(int data){
		Node new_node = new Node();
		new_node.data = data;
		if(isEmpty()){
			first = new_node;
		}else{
			last.next = new_node;
			last = new_node;
		}
	}
	
	public int deleteFirst(){
		int temp = first.data;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
		
	}
	public void displayList(){
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
	}
}
