package classwork;

public class RecursiveBST {
	private BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
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
	
}
