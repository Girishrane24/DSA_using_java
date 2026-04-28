package classwork;

/*
 * Create a single node 
 */
public class IntNode {
	// Initialize data variable
	private int data;
	private IntNode next; // self Reference variable
	
	// default constructor
	public IntNode() 
	{
		data = 0;
		next = null;
	}
	
	// Parameterized constructor with argument d as data, 
	// data variable store value from argument
	// and next will store null value --> it will not point to anyone 
	public IntNode(int d)
	{
		data = d;
		next = null;
	}
	/*
	 * use getter and setter of data and address
	 */
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public IntNode getNext() {
		return next;
	}
	public void setNext(IntNode next) {
		this.next = next;
	}
	
}
