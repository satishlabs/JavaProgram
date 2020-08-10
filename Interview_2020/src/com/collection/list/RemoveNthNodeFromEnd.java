package com.collection.list;

public class RemoveNthNodeFromEnd {
	static Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		RemoveNthNodeFromEnd list = new RemoveNthNodeFromEnd();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		int n = 2; 
	      
		System.out.print("Linked list before modification: \n"); 
		list.display();
		System.out.println();
		list.removeNthFromEnd(2);
		System.out.print("Linked list after modification: \n"); 
		list.display();
	}
	private Node removeNthFromEnd(int n) {
		int len=0;
		Node temp = head;
		while(temp != null) {
			len++;
		temp = temp.next;
		}
		
		if(n > len) {
			 System.out.print("Length of the linked list is " + len); 
		     System.out.print(" we can't remove "+ n +  "th node from the"); 
		     System.out.print(" linked list\n"); 
		     return head;
		}
		else if(n == len) {
			return head.next;
		}else {
			int diff = len-n;
			Node prev = null;
			Node curr = head;
			for(int i=0; i<diff; i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			return head;
		}
		
	}
	private void display() {
		Node temp = head;
		while(temp != null){
			System.out.print("[ "+temp.data+" ] ");
			temp = temp.next;
		}
	}
	private void addNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
