package com.program;
class Node{
	int data;
	Node left,right;
	
	Node(int d){
		this.data = d;
		left = right = null;
	}
}
public class BinaryTree {
	public static void main(String[] args) {
		BinaryTree biTree = new BinaryTree();
		Node root = null;
		root = biTree.insert(root,20);
		biTree.insert(root,21);
		biTree.insert(root,11);
		biTree.insert(root,1);
		biTree.insert(root,6);
		biTree.insert(root,5);
		biTree.insert(root,30);
		System.out.println("Minimum value of BST is " + biTree.minvalue(root));
	}

	public int minvalue(Node node) {
		Node current = node;
		while(current.left != null){
			current = current.left;
		}
		return current.data;
	}

	public Node insert(Node node, int data) {
		Node head;
		if(node == null){
			return new Node(data);
		}else{
			if(data<= node.data){
				node.left = insert(node.left,data);
			}{
				node.right = insert(node.right,data);
			}
		}
		return node;
	}
}
