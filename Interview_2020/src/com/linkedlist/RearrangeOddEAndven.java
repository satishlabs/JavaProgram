package com.linkedlist;

public class RearrangeOddEAndven {
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
		RearrangeOddEAndven list = new RearrangeOddEAndven();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		
	
		//printNode
		list.printNode(head);
		list.rearrangeOddEven(head);
		System.out.println();
		System.out.println("===================-=======================");
		System.out.println();
		list.printNode(head);
		
	}
	private Node rearrangeOddEven(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
		
		while(odd.next != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
		
	}
	private void printNode(Node head) {
		while(head != null) {
			System.out.print("[ "+head.data+" ]"+" -> "); 
			head = head.next;
		}
		System.out.println("Null");
	}
	private void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
}
