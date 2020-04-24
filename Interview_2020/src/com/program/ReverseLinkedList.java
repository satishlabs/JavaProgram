package com.program;

public class ReverseLinkedList {
	static Node head;
	
	private static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		System.out.println("Given Linked list"); 
		list.printList(head);
		System.out.println("------------------------------");
		head = reverse(head);
		System.out.println("===============================");
		list.printList(head);
	}
	public static  Node reverse(Node head) {
		Node prev = null;
		Node cur = head;
		Node next = null;
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		return head;
	}
	public void printList(Node node) {
		while(node != null){
			System.out.print(node.data+"->");
			node = node.next;
		}
		
	}
}
