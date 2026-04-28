package classwork;

public class CircularLL {
	
	private IntNode last;
	
	public CircularLL() 
	{
		last = null;
	}
//	public CircularLL(int d)
//	{
//		
//		last = null;
//	}
	
	// Insert first
	public void InsertFirst(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(last == null)
		{
			last = new_node;
			last.setNext(last);
			return ;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}
	
	// 
	
	
	
	
}
