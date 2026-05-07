package assignment;


class BTNode{
	private int data;
	private BTNode left,right;
	public BTNode(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BTNode getLeft() {
		return left;
	}
	public void setLeft(BTNode left) {
		this.left = left;
	}
	public BTNode getRight() {
		return right;
	}
	public void setRight(BTNode right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "BTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
	
	
}

class BTTree{
	private BTNode root;
	public BTNode getRoot() {
		return root;
	}
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	public BTNode createNode(int d)
	{
		BTNode new_node = new BTNode(d);
		return new_node;
	}
	
	private void visitPreorder(BTNode r)
	{
		if(r == null)
			return;
		System.out.println(r.getData());
		visitPreorder(r.getLeft());
		visitPreorder(r.getRight());
	}
	
	public void visitPreorderMain()
	{
		visitPreorder(root);
	}
}


public class UbinaryTree {
	
	
	public static void main(String[] args) {
		
		BTTree tree = new BTTree();
		tree.setRoot(tree.createNode(50));
		tree.getRoot().setLeft(tree.createNode(17));
		tree.getRoot().setRight(tree.createNode(72));
		tree.visitPreorderMain();
	}

}
