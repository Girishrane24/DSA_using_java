package classwork;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private BTNode root;
	
	public BinaryTree() 
	{
		root = null;
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	// Create new node 
	public BTNode createNode(int d)
	{
		BTNode new_node = new BTNode(d);
		return new_node;
	}
	
	//Recursion call for function visitPreOrder
	private void visitPreOrder(BTNode r)
	{
		// check if the value of r is null or not
		if(r == null)
		{
			return;
		}
		System.out.print(r.getData() + " "); // print the data that is available here.
		visitPreOrder(r.getLeft());  // Add to left side of node 
		visitPreOrder(r.getRight()); // Add to right side of node
	}
	
	// to make the visitPreOrder method public
	public void preOrder()  // this is wrapper function
	{
		visitPreOrder(root);
	}
	
	// Display your result in level-wise
	public void disp_levelwise()
	{
		if(root == null)
		{
			System.out.println("Empty");
			return;
		}
	
	
	Queue<BTNode> q = new LinkedList<>();  // Declare inside method
    q.add(root);  // Start with root
    
    while (!q.isEmpty()) {
        BTNode iter = q.remove();  // Dequeue (use poll() for safety)
        
        System.out.print(iter.getData() + " ");  // Print current node
        
        if (iter.getLeft() != null)
            q.add(iter.getLeft());   // Enqueue left child
        if (iter.getRight() != null)
            q.add(iter.getRight());  // Enqueue right child
    }
    System.out.println();  // New line at end
	
	}
		// Display your result in level-wise
	public void disp_Lef_node()
		{
			if(root == null)
			{
				System.out.println("Empty");
				return;
			}
		
		
		Queue<BTNode> q = new LinkedList<>();  // Declare inside method
	    q.add(root);  // Start with root
	    
	    while (!q.isEmpty()) {
	        BTNode iter = q.remove();  // Dequeue (use poll() for safety)
	        
	        if(iter.getLeft() == null && iter.getRight() == null)
	        System.out.print(iter.getData() + " ");  // Print current node
	        
	        if (iter.getLeft() != null)
	            q.add(iter.getLeft());   // Enqueue left child
	        if (iter.getRight() != null)
	            q.add(iter.getRight());  // Enqueue right child
	    }
	    System.out.println();  // New line at end
		
	}
	
	// Sum of Leaf  node
	public int sumOfLeafNode()
	{
		if(root == null)
		{
			System.out.println("Empty");
			return 0;
		}
		Queue<BTNode> q = new LinkedList<>();
		q.add(root);
		int sum = 0;
		while(!q.isEmpty())
		{
			BTNode iter = q.remove();
			if((iter.getLeft() == null) && (iter.getRight() == null))
				//System.out.println("Node is : " + iter.getData());
		        sum = sum + iter.getData();
			
		        if (iter.getLeft() != null)
		            q.add(iter.getLeft());   // Enqueue left child
		        if (iter.getRight() != null)
		            q.add(iter.getRight());  // Enqueue right child
		    }
		return sum;
	}
	
	// Sum of non Leaf node
	public int sumOfNonLeafNode()
	{
		int sum = 0;
		if(root == null)
		{
			System.out.println("Empty");
			return 0;
		}
		Queue<BTNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			BTNode iter = q.remove();
			if(iter.getLeft() != null || iter.getRight() != null)
			{
				System.out.println("Node is : " + iter.getData());
		        sum = sum + iter.getData();
			}
		    if (iter.getLeft() != null)
		        q.add(iter.getLeft());   // Enqueue left child
		    if (iter.getRight() != null)
		    	q.add(iter.getRight());  // Enqueue right child
		    //System.out.println("Print node : " + root.getData());
		    }
		return sum;
	}
	
	
	
	public void insertLevelWise(int d)
	{
		BTNode newNode = createNode(d);

		if (root == null) 
		{
			root = newNode;
			return;
		}

		BTNode temp;
		Queue<BTNode> q = new LinkedList<>();
		q.add(root);
		
		while (!q.isEmpty()) 
		{
			temp = q.poll();

			if (temp.getLeft() == null) 
			{
				temp.setLeft(newNode);
		        	return;
		    } 
			else 
			{
				q.add(temp.getLeft());
		    }

		    if (temp.getRight() == null) 
		    {
		    	temp.setRight(newNode);
		        return;
		    } 
		    else 
		    {
		    	q.add(temp.getRight());
		    }
		}
	}
	
	
	
	public void insert_nonrec(int d)
	{
		// Create new node for data d
		BTNode new_node = new BTNode(d);
		
		
		// check if the given node is null or not? 
		// Assign the root value to new_node
		if(root == null)
			
		{
			root = new_node;
			return;
		}
		
		// Assign iter value as root value
		BTNode iter = root;
		
		BTNode par = null;
		
		// Iterate till you do not get null
		while(iter != null)
		{
			par = iter;
			
			// Traverse to the left of the tree 
			if(d < iter.getData())
			{
				iter = iter.getLeft();
			}
			// Traverse to the right of the tree
			else if(d > iter.getData())
			{
				iter = iter.getRight();
			}
			
			// return if you found any duplicate value.
			else
			{
				System.out.println("Duplicate Found ....");
				
			}
			
		}
		
		// Add your new node to the left or right of the iter value
		if(d < par.getData())
		{
			// Insert node from the left side
			par.setLeft(new_node);
		}
		else
		{
			// Insert from the right side.
			par.setRight(new_node);
		}
	
	}

	
	private BTNode insert(BTNode ptr,int d)
	{
		if(ptr == null)
		{
			return new BTNode(d);
			
		}
		else if(d < ptr.getData())
		{
			ptr.setLeft(insert(ptr.getLeft(),d));
		}
		else if(d > ptr.getData())
		{
			ptr.setRight(insert(ptr.getRight(),d));
		}
		else
		{
			System.out.println("Duplicate");
		}
		return ptr;
	}
	
	public void insert_recursive(int d)
	{
		root = insert(root,d);
	}
	
	
	
	// Get min value of Binary Tree
	public int binaryTreeMin() {
	    if (root == null) {
	        System.out.println("Tree is empty");
	        return -1;
	    }

	    BTNode iter = root;

	    while (iter.getLeft() != null) {
	        iter = iter.getLeft();
	    }

	    return iter.getData();
	}

	// get max value from Binary Tree
	public int binaryTreeMax() {
	    if (root == null) {
	        System.out.println("Tree is empty");
	        return -1;
	    }

	    BTNode iter = root;

	    while (iter.getRight() != null) {
	        iter = iter.getRight();
	    }

	    return iter.getData();
	}
	
	
	
	// Compare two Binary Tree
	
	public boolean treeCompare(BinaryTree t)
	{
		BTNode iter1, iter2;
		
		if(root == null || t.getRoot() == null)
			return false;
		
		Queue<BTNode> q1 = new LinkedList<>();
		Queue<BTNode> q2 = new LinkedList<>();
		
		iter1 = root;
		iter2 = t.getRoot();
		
		q1.add(iter1);
		q2.add(iter2);
		
	    while((!q1.isEmpty()) && (!q2.isEmpty()))
	    {
	    	iter1 = q1.remove();
	    	iter2 = q2.remove();
	    	
	    	if(iter1.getData() != iter2.getData())
	    	{
	    		return false;
	    	}
	    	if(iter1.getLeft() != null)
	    	{
	    		q1.add(iter1.getLeft());
	    	}
	    	if(iter1.getRight() != null)
	    	{
	    		q1.add(iter1.getRight());
	    	}
	    	if(iter2.getLeft() != null)
	    	{
	    		q1.add(iter2.getLeft());
	    	}
	    	
	    	if(iter2.getRight() != null)
	    	{
	    		q1.add(iter2.getRight());
	    	}
	    }

	    if(q1.isEmpty() && q2.isEmpty())
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	
	}
	
	// Find height
	public int find_height(BTNode ptr)
	{
		int left = 0,right = 0;
		if(ptr == null)
			return 0;
		if(ptr.getLeft() != null)
			left = find_height(ptr.getLeft());
		if(ptr.getRight() != null)
			right = find_height(ptr.getRight());
		if(left > right)
			return left + 1;
		else
			return right + 1;
		
	}
	
	public void del(int d)
	{
		root = del_rec(root,d);
	}
	
	public BTNode del_rec(BTNode ptr, int d)
	{
		
		BTNode deletable;
		if(ptr == null)
		{
			System.out.println("Not Found");
			return null;
		}
		if(d < ptr.getData())
		{
			//ptr.setData(del_rec(ptr.getLeft(),d));
		}
			
		return ptr;
	}
	
	
	
	
	
	public void search(int d)
	{
		BTNode new_node = createNode(d);
		
		if(root  == null)
		{
			root = new_node;
		}
		BTNode iter = root;
		
		while(iter != null)
		{
			if(d == iter.getData())
			{
				System.out.println( "Number " + d + " Found");
				return;
			}
			else if(d < iter.getData())
			{
				iter = iter.getLeft();
			}
			else
			{
				iter = iter.getRight();
			}
		}
		System.out.println("Number not found");
		return;
	}
	
	
	
}
	

