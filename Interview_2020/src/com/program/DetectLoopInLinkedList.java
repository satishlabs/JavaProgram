package com.program;

public class DetectLoopInLinkedList {
	static Node head; // head of list 
	  
    /* Linked list Node*/
   private static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
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
  
   int detectLoop() 
    { 
        Node slow_p = head, fast_p = head; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                System.out.println("Found loop"); 
                return 1; 
            } 
        } 
        return 0; 
    } 
  
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	DetectLoopInLinkedList llist = new DetectLoopInLinkedList(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head; 
  
       llist.detectLoop(); 
       /* llist.detectLoop(head); 
        if(llist.detectLoop(head)){
        	System.out.println("Loop");
        }else{
        	System.out.println("Not Loop");
        }*/
        
        // find where the loop starts
        int data = llist.findLoopStart().data;
        System.out.print("\nloop detected starting at node "+data);
    }

	public Node findLoopStart() {
	if(head.next == null){
		System.out.println("EMpty List");
		return null;
	}
	Node p1 = head.next;
	Node p2 = p1;
	do{
		if(p1 == null || p2==null || p2.next == null){
			System.out.println("No Loop");
			return null;
		}
		p1 = p1.next;
		p2 = p2.next.next;
	}while(p1 != p2);
	
	p1 = head.next;
	
	while(p1 != p2){
		p1 = p1.next;
		p2 = p2.next;
	}
	return p1;
}

/*	public boolean detectLoop(Node node) {
		
		HashSet<Node> s = new HashSet<>();
		while(node != null){
			if(s.contains(node))
				return true;
			
			s.add(node);
			node = node.next;
		}
		return false;	
	} */
}
