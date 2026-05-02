package classwork;

public class SumOfNonLeafNodeUBinaryTree {
	public static void main(String[] args) {
		
	// create object for tree
	BinaryTree tree = new BinaryTree();
	
	
	// Create tree : 
	tree.setRoot(tree.createNode(1));
	tree.getRoot().setLeft(tree.createNode(2));
	tree.getRoot().setRight(tree.createNode(3));
	tree.getRoot().getLeft().setLeft(tree.createNode(4));
	tree.getRoot().getLeft().setRight(tree.createNode(5));
	tree.getRoot().getRight().setLeft(tree.createNode(6));
	tree.getRoot().getRight().setRight(tree.createNode(7));
	tree.getRoot().getLeft().getRight().setLeft(tree.createNode(8));
	tree.getRoot().getLeft().getLeft().setLeft(tree.createNode(9));
	tree.getRoot().getLeft().getLeft().setRight(tree.createNode(10));
	tree.getRoot().getRight().getLeft().setRight(tree.createNode(11));
	//tree.getRoot().getRight().setRight(tree.createNode(12));
	
	//tree.preOrder();
	
	// 
	int sum = tree.sumOfNonLeafNode();
	System.out.println("Sum of Non Leaf node is : " + sum);
	
	}
}
