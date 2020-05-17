package com.linkedlist;

public class InsertNodeBetweenGivenNode {
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
		InsertNodeBetweenGivenNode list = new InsertNodeBetweenGivenNode();
		list.push(1);
		list.push(2);
		//list.push(3);
		list.push(4);
		list.push(5);
		
		list.printNode(head);
		System.out.println();
		System.out.println("==========================");
		list.insertNodeAfter(head,4,3);
		list.printNode(head);
		
	}

	private void insertNodeAfter(Node head, int key, int new_data) {
		Node temp =head;
		Node prev= null;
		if(temp.data != key) {
			temp = temp.next;
			prev = temp.next;
		}	
		Node node = new Node(new_data);
		temp.next = node;
		node.next = prev;
		
	}

	private void printNode(Node head) {
		while(head != null) {
			System.out.print("[ "+head.data+" ]");
			head = head.next;
		}
		
	}

	private void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		
	}
}
