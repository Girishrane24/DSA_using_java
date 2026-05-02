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
		
		
		return true;
	}
	
	
	
}
	

