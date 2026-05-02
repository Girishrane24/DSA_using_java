package classwork;

public class BTNode {
	private int data;
	private BTNode left;
	private BTNode right;
	
	public BTNode() 
	{
		data = 0;
		left = null;
		right = null;
	}
	public BTNode(int d) 
	{
		data = d;
		left = null;
		right = null;
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
	
	
	
}
