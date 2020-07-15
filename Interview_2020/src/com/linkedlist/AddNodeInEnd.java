package com.linkedlist;

public class AddNodeInEnd {
	static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int new_node) {
			this.data = new_node;
			this.next= null;
		}
	}
	
	public static void main(String[] args) {
		AddNodeInEnd list = new AddNodeInEnd();
		list.addNodeToEnd(1);
		list.addNodeToEnd(10);
		list.addNodeToEnd(16);
		
		list.addNodeInFirst(6);
		
		int n = 2, x = 11;  
		list.insertAfterNthNode(n, x);  
	    System.out.println(); 
	    System.out.println("Linked List After Insertion: ");  
		
		list.display();
	}

	private void insertAfterNthNode(int n, int x) {
		// if list is empty 
		if(head == null)
			return;
		//get a new node for the value
		Node new_node = new Node(x);
		
		Node slow = head;
		Node fast = head;
		
		for(int i=1;i<=n-1;i++) {
			fast = fast.next;
			while(fast.next != null) {
				slow = slow.next;
				fast = fast.next;
			}
			new_node.next = slow.next;
			slow.next = new_node;
		}
		
	}

	private void addNodeInFirst(int i) {
		Node temp = new Node(i);
		temp.next = head;
		head = temp;
		
	}

	private void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	private void addNodeToEnd(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
		return;
	}

	
}
