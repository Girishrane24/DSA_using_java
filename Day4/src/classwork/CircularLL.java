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
	
	// Insert at Last 
	public void InsertLast(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(last == null)
		{
			last = new_node;
			last.setNext(last);
			return;
		}
		new_node.setNext(last.getNext());
		
		last.setNext(new_node);
		last = new_node;
		return;
	
	}
	
	public void display()
	{
		IntNode iter = last.getNext();
		if(iter == null)
		{
			System.out.println("return");
			return;
		}
		do
		{
			System.out.println(iter.getData() + "  ");
			iter = iter.getNext();
		}while(iter != last.getNext());
	}
	
	public int deleteFirst()
	{
		IntNode last = null;
		IntNode deletable= null;
		int d;
		if(last == null)
			return -999;
		deletable = last.getNext();
		d = deletable.getData();
		if(last == deletable)
		{
			deletable.setNext(null);
			deletable = null;
			last = null;
		}
		
		return 0;
	}
	
	
	
}
