package day8;

class BinaryTreeArray
{
	int tree[];
	BinaryTreeArray(int s)
	{
		// initialize dummy variable
		int i; 
		// create new reference to tree s
		tree = new int[s];
		
		for(i = 0; i<tree.length;i++) {
			tree[i] = -999;
		}
		
	}
	
	// Create new node
	public void createRoot(int d)
	{
		// check if root node / new node has value
		// create new node here
		if(tree[0] == -999)
		{
			tree[0] = d;
		}
		else
		{
			// if the node is available or not ?
			System.out.println("Tree has root node.....");
		}
		return;
	}
	// insert new child at left of node
	// method insertLeftChild contain 2 parameters, 
	// d = value, par = position
	public void insertLeftChild(int d, int par)
	{
		if(tree[par] == -999)
		{
			System.out.println("Invalid operation.. parent absent");
			return;
		}
		tree[(par * 2) + 1] = d;
		return;
	}
	// Insert right child
	public void insertRightChild(int d, int par)
	{
		if(tree[par] == -999)
		{
			System.out.println("Invalid operation.. parent absent");
			return;
		}
		tree[(par * 2) + 2] = d;
		return;
	}
	
	// traverse / print all nodes
	
	public void traverse()
	{
		int i;
		for(i = 0;i<tree.length;i++)
			System.out.println(tree[i]);
	}
}

public class BinaryTreeUsingArray {
	
	public static void main(String[] args) {
		BinaryTreeArray t = new BinaryTreeArray(10);
		
		t.createRoot(10);
		t.insertLeftChild(20, 0);
		t.insertRightChild(30, 0);
//		t.insertLeftChild(40, 0);
		t.insertRightChild(50, 1);
		t.traverse();
	}
}
