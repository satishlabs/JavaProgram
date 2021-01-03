package com.linkedlist;

public class LinkedList1 {
	static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.insetFront(12);
		list.insetFront(11);
		list.insetFront(19);
		
		//list.display();
		
		list.insertEnd(20);
		
		list.insetFront(30);
		
		list.insertAfter(head,11,25);
		list.display();
	}
	
	private void insertAfter(Node head2, int key, int data) {
		Node new_node = new Node(data);
		while(head == null) {
			head = new Node(data);
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.data != key) {
			temp = temp.next;
			prev = temp.next;
		}
		temp.next = new_node;
		new_node.next = prev;
	}

	private void insertEnd(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = new Node(data);
			return;
		}
		node.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		
	}
	private void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	private void insetFront(int data) {
		Node node = new Node(data);
		if(head == null) {
			node = new Node(data);
		}
		node.next = head;
		head = node;
	}
}
