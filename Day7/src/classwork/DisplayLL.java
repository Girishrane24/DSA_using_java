package classwork;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayLL {
	private BTNode root;
	
	public DisplayLL()
	{
		root = null;
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
	
}

