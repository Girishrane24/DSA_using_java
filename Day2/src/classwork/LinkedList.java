package classwork;

public class LinkedList {
	
	private IntNode head;
	
	public LinkedList() 
	{
		head = null;
	}
	public void insertFirst(int d)
	{
		IntNode new_node = new IntNode(d);
		if(head == null)
		{
			head = new_node;
			return;
		}
		else
		{
			
		}
	
	new_node.setNext(head);
	head = new_node;
	}

	
	// Insert LinkedList node from last 
	public void insertLast(int d)
	{
		IntNode new_node = new IntNode(d);
		if(head == null)
		{
			head = new_node;
			return;
		}
		IntNode itr = head;
		
		while(itr.getNext() != null)
		{
			itr = itr.getNext();
		}
		itr.setNext(new_node);
		return;
	}
	
	// Display linked list data
	public void display()
	{
		IntNode iter = head;
		while(iter != null)
		{
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
	}
	
	// Delete Node from first
	public int deleteFirst()
	{
		if(head == null)
		{
			return -999;
		}
		int d = head.getData();
		head = head.getNext();  
		return d;
	}
}
