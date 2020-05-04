package algo.binarysearch;

public class Application {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(10,"Ten");
		tree.insert(20,"Twenty");
		tree.insert(15,"Fifteen");
		tree.insert(25,"Twenty");
		tree.insert(12,"Fifteen");
		
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		
		System.out.println(tree.remove(10));
		System.out.println(tree.findMin().key);
	}
}
