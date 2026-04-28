package classwork;

public class DoublyNode {

	// Initialize variable
	private int data; // Node variable
	private DoublyNode prev; // Previous address of Double Linked List
	private DoublyNode next; // Next Address of Double Linked List
	
	// Default constructor
	public DoublyNode() 
	{
		data = 0; // Initialize value of data
		prev = null; // Initialize value of data
		next = null; // Initialize value of data
	}
	// Parameterized constructor 
	// It invoke when object created
	public DoublyNode(int d)
	{
		data = d; // Set Data to d
		prev = null; // Set prev value 
		next = null; // Set next value
	}
	// Set getter and setter values for DoublyNode
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
	
	
	
	
	
}
