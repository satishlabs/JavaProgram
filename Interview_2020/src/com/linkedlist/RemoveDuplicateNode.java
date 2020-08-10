package com.linkedlist;

public class RemoveDuplicateNode {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		    next = null;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicateNode llist = new RemoveDuplicateNode();
		llist.push(20); 
        llist.push(13); 
        llist.push(13); 
        llist.push(11); 
        llist.push(11); 
        llist.push(11); 
		
		System.out.println("Print all Nodes");
		llist.printList(head);
		
		llist.remove_duplicates(); 
		//llist.removeDuplicates();
	        System.out.println(""); 
	        System.out.println("Linked List after removing duplicates : \n "); 
	        llist.printList(head); 
	}
	private void removeDuplicates() {
		/*Another reference to head*/
        Node curr = head; 
  
        /* Traverse list till the last node */
        while (curr != null) { 
             Node temp = curr; 
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp; 
            curr = curr.next; 
        } 
	}
	public void remove_duplicates() {
		Node ptr1= head;
		Node ptr2= null;
		Node dup =null;
		
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
		
		
	}
	 /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
   
        /* 3. Make next of new Node as head */
        new_node.next = head; 
   
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
		
	}
}
