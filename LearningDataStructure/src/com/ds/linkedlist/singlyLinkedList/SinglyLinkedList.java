package com.ds.linkedlist.singlyLinkedList;

public class SinglyLinkedList {
	private Node head;
	
	public SinglyLinkedList(){
		
	}
	
	public boolean isEmpty(){
		return(head == null);
	}
	
	//used to insert at the data begining of the list
	public void insert(int data){
		Node new_node  = new Node();
		new_node.data = data;
		new_node.next = head;
		head = new_node;
	}
	
	//used to delete at the data begining from the list
	public Node deleteFirst(){
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	public void displayList(){
		Node current = head;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
	}
	
	public void insertLast(int data){
		Node new_node = new Node();
		new_node.data = data;
		Node temp =head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new_node;
	}
}
