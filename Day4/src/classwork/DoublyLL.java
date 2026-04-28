package classwork;

/*
 * In this class, we will learn DoublyLL 
 * 
 * 
 * there are 3 terms for every node
 * nodeName --> Address of that node
 * nodeName.next --> next Address of that node 
 * nodeName.prev -- > previous address of that node
 * 
 *  
 */

public class DoublyLL {
	
	// Assign default value as head
	private DoublyNode head;
	
	// Parameterized constructor
	public DoublyLL() 
	{
		head = null;
	}
	
	// Insert node from first of Linked List
	public void insertFirst(int d)
	{
		// Create new node for data
		// variable called new_node
		DoublyNode new_node = new DoublyNode(d);
		
		// check if head is null or not
		if(head == null)
		{
			head = new_node; // assign head value to your node
			return; // return statement, don't execute next statements
		}
		new_node.setNext(head); // set your head address to next of new_node.  
		head.setPrev(new_node); // set your head previous address with new node address.
		head = new_node;  // assign your previous node to your head node
		return;
	}
	
	// Insert node from last of Linked List
	public void insertLast(int d)
	{
		// Create new node for data
		// variable called new_node
		DoublyNode new_node = new DoublyNode(d);
		
		// check if your head is not null 
		if(head == null)
		{
			head = new_node; // assign head value to your node
			return; // return statement, don't execute next statements
		}
		
		// assign head node to iter variable, 
		// this one point to the head value
		DoublyNode iter = head;
		
		// traverse till your next address of iter not null, 
		while(iter.getNext() != null)
		{
			iter = iter.getNext();
		}
		
		new_node.setPrev(iter); // set address of iter to previous of new_node.
		iter.setNext(new_node); // set address of new_node to iter
		return;
		
	}
	
	// Insert by position
	/* 
	 * there is some condition to insert the node at given user position
	 * 
	 * case1 : if head is null
	 * case 2 : if position is pointed to 1st location ( p = 1)
	 * case 3 : traverse till that position and insert that node
	 */
	public void insertByPosition(int d, int pos)
	{
		// Create new node for data
		// variable called new_node
		DoublyNode new_node = new DoublyNode(d);
				
		// check if your head is not null 
		if(head == null)
		{
			head = new_node; // assign head value to your node
			return; // return statement, don't execute next statements
		}
		if(pos == 1)
		{
			insertFirst(d); // call insertFirst method and add node at first location
			return; // return the statement
		}
		
		DoublyNode iter = head; // assign head node to iter variable
		for(int i = 1; i< pos - 1 && iter.getNext() != null;i++)
		{
			iter = iter.getNext();
		}
		new_node.setNext(iter.getNext());
		new_node.setPrev(iter);
		
		// check if your next address of iter is not null
		if(iter.getNext() != null)
		{
			// set the value of iter previous
			iter.getNext().setPrev(new_node);
		}
		iter.setNext(new_node);
	}
	
	// Delete linked list
	public void deletelist()
	{
		head  = null;
	}
	
	
	// Delete first node from linked list
	public int deleteFirst()
	{
		DoublyNode deletable; // create dummy variable
		
		int d = -999;
		if(head == null)
		{
			return d;
		}
		deletable = head;
		
		d = deletable.getData();
		head = head.getNext();
		
		
		// set the next value of deletable node to null
		deletable.setNext(null);
		//assign deletable to null for garbage collection
		deletable = null;
		
		return d;
		
	}
	
	
	// Delete from last 
	public int deleteLast()
	{
		// If Linked List contain only one node and that one is head node
		if(head == null)
		{
			return -999;
		}
		int d;
		DoublyNode iter = head;
		// check if your head is not null
		if(head.getNext() == null)
		{
			d = head.getData(); // get data of head to variable d
			head = null; // assign value to head as null
			return d;
		}
		while(iter.getNext().getNext() != null)
		{
			iter = iter.getNext();
		}
		DoublyNode deletable = iter.getNext();
		d = deletable.getData();
		deletable = null;
		iter.setNext(null);
		return d;
		
	}
	
	// delete by Position
	public int deletebyPos(int pos)
	{
		DoublyNode deletable; // Assign dummy variable
		int d;
			
		// check if your head is null or not.
		if(head == null)
		{
			return -999;
		}
		// check if position is first location or not, if yes, then call deleteFirst method.
		if(pos == 1)
		{
			d = deleteFirst(); // call deleteFirst method and return value of d
			return d; 
		}
			
		// Assign the value of itr to head
		DoublyNode itr = head; // assign head node to itr variable.
		for(int i = 1; i<pos - 1 && itr.getNext() != null; itr = itr.getNext(), i++);
		deletable = itr.getNext(); // Assign address of head node to deletable variable
		itr.setNext(itr.getNext().getNext());
		// check if address of itr is not null
		if(itr.getNext() != null)
		{
			deletable.getNext().setNext(itr);
			d = deletable.getData();
			deletable.setPrev(null);
			return d;
		}
	}
	
	// Display linked list data (Linked List)
		public void display()
		{
			DoublyNode iter = head;
			while(iter != null)
			{
				System.out.print(iter.getData() + "  ");
				iter = iter.getNext();
			}
			
		}
		
}
