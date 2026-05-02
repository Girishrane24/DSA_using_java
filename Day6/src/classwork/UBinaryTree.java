package classwork;



public class UBinaryTree {
	public static void main(String[] args) {
	
		BinaryTree tree = new BinaryTree();

		
		tree.setRoot(tree.createNode(50));
		tree.getRoot().setLeft(tree.createNode(17));
		tree.getRoot().setRight(tree.createNode(72));
		tree.getRoot().getLeft().setLeft(tree.createNode(12));
		tree.getRoot().getLeft().setRight(tree.createNode(23));
		tree.getRoot().getRight().setLeft(tree.createNode(54));
		tree.getRoot().getRight().setRight(tree.createNode(76));
		tree.getRoot().getLeft().getRight().setLeft(tree.createNode(79));
		tree.getRoot().getLeft().getLeft().setLeft(tree.createNode(9));
		tree.getRoot().getLeft().getLeft().setRight(tree.createNode(14));
		tree.getRoot().getRight().getLeft().setRight(tree.createNode(67));
		tree.getRoot().getRight().setRight(tree.createNode(76));
		
		System.out.println("PreOrder is : ");
		tree.preOrder();
		
		System.out.println();
		System.out.println("Display Level Wise : ");
		tree.disp_levelwise();
		
		System.out.println();
		System.out.println("Display Lef Node : ");
		tree.disp_Lef_node();
		
	}
}

