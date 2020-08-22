package com.linkedlist;

public class DeleteNodeInPosition {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		DeleteNodeInPosition list = new DeleteNodeInPosition();
		list.push(7);
		list.push(1);
		list.push(3);
		list.push(2);
		
		list.printNode();
		list.deleteNode(1);
		System.out.println();
		System.out.println("===============");
		list.printNode();
	}

	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		  // If head node itself holds the key to be deleted 
		while(temp != null && temp.data == key){
			head = temp.next;// Changed head 
			return;
		}
		 // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// If key was not present in linked list 
		if(temp == null)
			return;
		// Unlink the node from linked list 
		prev.next = temp.next;
	}

	private void printNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
		
	}

	public void push(int data) {
		Node temp = new Node(data);
		temp.next= head;
		head = temp;
	}
}
