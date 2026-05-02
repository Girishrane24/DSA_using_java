package classwork;

public class Search_NonRecursive {
	private BTNode root;
	
	public Search_NonRecursive()
	{
		root = null;
	}
	
	public void search(int d)
	{
		BTNode new_node = new BTNode(d);
		
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
