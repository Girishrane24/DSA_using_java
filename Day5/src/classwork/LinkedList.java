package classwork;

public class LinkedList {
	
	 IntNode head;
	
	public LinkedList() 
	{
		head = null;
	}
	
	/*
	 * Insert element form first : 
	 */
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
	
	// Display linked list data (Linked List)
	public void display()
	{
		IntNode iter = head;
		while(iter != null)
		{
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
	}
	
	// Delete Node from first index
//	public int deleteFirst()
//	{
//		if(head == null)
//		{
//			return -999;
//		}
//		int d = head.getData();
//		head = head.getNext();  
//		return d;
//	}
//	
	// Alternate way to write deleteFirst() method was given below : 
	
	public int deleteFirst()
	{
		// Initialize one variable deletable --> to navigate head
		IntNode deletable;
		// Check if head is null or not
		// That means our linked list contains only one node
		if(head == null)
		{
			return -999; // Return some default value
		}
		// Assign value of deletable to head -- > 
		deletable = head;
		// get the data from the head node 
		int d = deletable.getData();
		// get the address of the next element of the head
		head = head.getNext();
		// set the address of node to next null --> do that that first node will not point to any other node.
		deletable.setNext(null);
		
		// Return the value of d, which is the current data node.
		return d;
	}
	
	/*
	 * insert by position 
	 * d = data of node
	 * p = position of that node
	 */
	public void insert_byPos(int d, int p)
	{
		IntNode new_node = new IntNode(d);
		
		// Check if head is null or not
		if(head == null)
		{
			head = new_node;
			return;
		}
		// check if the position of insertion of the node is at the first position or not, if yes, then call the insertFirst Method
	
		if(p == 1)
		{
			insertFirst(d);
			return;
		}
		// Insert node at the middle of the list or at the end of the list : 
		IntNode itr = head; // assign head node to itr variable.
		
		/*
		 * Iterate your head value till the position - 1 location
		 * also check if the address of the next node is not null, 
		 * If found null, then stop iterating the for loop, and return the current node address.
		 */
		for(int i = 1; i < p - 1 && itr.getNext() != null; i++)
		{
			itr = itr.getNext(); 
		}
		// set the new node's address to the current node. so that you can traverse that linked list.
		new_node.setNext(itr.getNext());
		// set the address of next_node to itr variable.
		itr.setNext(new_node);
		return;
		}
	
	/*
	 * Delete node by position
	 * Take the position of the node from the user 
	 */
	public int deleteByPos(int pos)
	{
		IntNode deletable; // Assign dummy variable
		int d = -999;
		
		// check if your head is null or not.
		if(head == null)
		{
			return d;
		}
		// check if the position is the first location; if so, call the deleteFirst method.
		if(pos == 1)
		{
		d = deleteFirst(); // call the deleteFirst method and return the value of d
		return d; 
		}
		
		// Assign the value of itr to head
		IntNode itr = head; // assign head node to itr variable.
		for(int i = 1; i<pos - 1 && itr.getNext() != null; itr = itr.getNext(), i++);
		deletable = itr.getNext(); // Assign address of head node to deletable variable
		
		// check if the address of ITR is not null
		if(itr.getNext() != null)
		{
			itr.setNext(deletable.getNext()); // need to check if this line stiill required or not
			d = deletable.getData();
			deletable.setNext(null);
			return d;
		}
		else
		{
			System.out.println("Position invalid"); // Position of delete node exceeded the length of the linked list
			return -999;
		}
	}
	
	/*
	 * delete the last node from the linked list
	 */
	public int deleteLast()
	{
		int d;
		if(head == null)
		{
			return -999;
		}
		IntNode itr = head; // assign head node to itr dummy variable
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		
		// check if next. next node was null or not
		while(itr.getNext().getNext() != null)
		{
			itr = itr.getNext();
		}
		
		IntNode deletable = itr.getNext();
		d = deletable.getData();
		deletable = null;
		itr.setNext(null);
		return d;
	}
	
	/*
	 * Insert your data to insert via sorted data
	 */
	public void insertSorted(int d)
	{
		IntNode new_node = new IntNode(d);
		
		// check if head is not null and value of d less than value of d
		if((head == null) || (d < head.getData()))
		{
			insertFirst(d);
			return;
		}
		
		IntNode itr = head;
		while((itr.getNext() != null) && (itr.getNext().getData() < d))
		{
			itr = itr.getNext();
		}
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	/*
	 * Insert node via InsertBefore
	 */
	public void insertBefore(int d, int key)
	{
		IntNode new_node = new IntNode(d);
		
		// check if head is null or not
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(head.getData() == key)
		{
			insertFirst(d);
			return;
		}
		IntNode itr = head;
		while(itr.getNext() != null && itr.getNext().getData() != key)
		{
			itr.getNext();
		}
		if(itr.getNext() != null)
		{
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		}
		else
		{
			System.out.println("Invalid key ...");
			return;
		}
	}
	/*
	 * Print the alternate nodes of the linked list 
	 */
	public void alternateNodes()
	{
		IntNode iter = head;
		while(iter != null)
		{
			System.out.println(iter.getData() + " -> ");
			if(iter.getNext() == null)
				break;
			else
				iter = iter.getNext().getNext();
			
		}
		
	}
	/*
	 * swapAlternateNodes 
	 */
	public void swapAlternateNodes()
	{
		
	}
	
	public void deletelist()
	{
		head  = null;
	}
	
	
	// Reverse LL using recursion
	public IntNode reverse(IntNode head)
	{
		IntNode temp;
		if(head.getNext() == null)
			return head;
		temp = reverse(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return temp;
		
	}
	
}
