package algo.binarysearch;

public class BST {
	private Node root;
	
	public void insert(int key,String value) {
		
		Node new_node = new Node(key, value);
		
		if(root == null) {
			root = new_node;
		}else {
			
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(key<current.key) {
					current = current.leftChild;
					if(current == null) { //Its parent is the leaf node from left node
						parent.leftChild = new_node;
						return;
					}
				}else {
					current = current.rightChild;
					if(current == null) { //Its parent is the leaf node from right node
						parent.rightChild = new_node;
						return;
					}
				}
			}
		}
	}
	//Find the Min value in Binary Search tree
	public Node findMin() {
		Node current = root;
		Node last = null;
		
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	//Find the Max value in Binary Search Tree
	public Node findMax() {
		Node current = root;
		Node last=null;
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public boolean remove(int key) {
		Node currentNode = root;
		Node parentNode = root;
		
		boolean isLeftChild = false;
		//Searching to find the node with the key to delete
		
		while(currentNode.key != key) {
			parentNode = currentNode;
			if(key<currentNode.key) {
				isLeftChild = true;
				currentNode = currentNode.leftChild;
			}else {
				currentNode = currentNode.rightChild;
				isLeftChild = false;
			}
			if(currentNode == null) {
				return false;
			}
		}
			//found the node to delete
			Node nodeToDelete = currentNode;
			
			//if node is a leaf
			if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
				
				if(nodeToDelete == root) {
					root = null;
				}else if(isLeftChild) {
					parentNode.leftChild = null;
				}else {
					parentNode.rightChild =null;
				}
			}
			//if node has one child that is the left
			else if(nodeToDelete.rightChild == null) {
				if(nodeToDelete == root) {
					root = nodeToDelete.leftChild;
				}else if(isLeftChild) {
					parentNode.leftChild = nodeToDelete.leftChild;
				}else {
					parentNode.rightChild = nodeToDelete.rightChild;
				}
			}
			//if node has one child that is the right
			else if(nodeToDelete.leftChild ==null){
				if(nodeToDelete == root) {
					root = nodeToDelete.rightChild;
				}else if(isLeftChild) {
					parentNode.rightChild = nodeToDelete.rightChild;
				}else {
					parentNode.leftChild = nodeToDelete.leftChild;
				}
			}
			//if node has 2 children (ticky)
			else {
				Node successor = getSuccessor(nodeToDelete);
				//connect parent of nodeToDelete to successor instead
				if(nodeToDelete == null) {
					root = successor;
				}else if(isLeftChild) {
					parentNode.leftChild = successor;
				}else {
					parentNode.rightChild = successor;
				}
				
				successor.leftChild = nodeToDelete.leftChild;
			}
			
		return true;	
		}
	
	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		
		Node current = nodeToDelete.leftChild; //Go to the right child
		while(current != null) { //start going left down the tree until node has no left child
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		//is successor node a right child
		if(successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToDelete.rightChild;
		}
		return successor;
	}
	
}
