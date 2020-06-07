package com.linkedlist;

public class AddNodeInStart {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
		}
	
	public static void main(String[] args) {
		AddNodeInStart list = new AddNodeInStart();
		list.add(3);
		list.add(6);
		list.add(1);
		list.displayNode();
		
	}
	private void displayNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
	}
	public void add(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
}
