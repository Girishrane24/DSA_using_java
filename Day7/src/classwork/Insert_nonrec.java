package classwork;

public class Insert_nonrec {

	private BTNode root;
	
	// Default Constructor
	public Insert_nonrec()
	{
		root = null;
	}
	/*
	 * Insert node at non-recursive order
	 */
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
	
}
