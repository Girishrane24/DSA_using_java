package classwork;

import java.util.Arrays;

public class Circular {
	private int arr[];
	private int rear,front;
	
	public Circular() {}
	
	public Circular(int s)
	{
		arr = new int[s];
		front = rear = -1;
		
	}
	public boolean isFull()
	{
		if(((front == 0) && (rear == arr.length - 1)) || (front == rear + 1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void insertQ(int d)
	{
		if(isFull())
		{
			System.out.println("Error : overflow");
			return;
		}
		if(front == -1)
			front = 0;
		if(rear == arr.length - 1)
		{
			rear = 0;
		}
		else 
		{
			rear = rear + 1;
			arr[rear] = d;
		}
	}
	
	public boolean isEmpty()
	{
		if(front == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int deleteQ()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("Error.. .Underflow");
			return d;
		}
		d = arr[front];
		if(front == rear)
		{
			front = rear = -1;
		}
		else if(front == arr.length - 1)
		{
			front = 0;
		}
		else
		{
			front  = front + 1;
		}
		return d;
		
	}
	public int peek()
	{
		int d = -999;
		// check if queue is empty or not, if yes then return value of d as default value.
		if(isEmpty())
		{
			return d;
		}
		else
		{
		}
		// else get value of array from front val.
		d = arr[front];
		System.out.println(d);
		return d;
	}

	public String toString() {
		return "Circular [arr=" + Arrays.toString(arr) + "\n, rear=" + rear + ",\n front=" + front + "]\n";
	}
	

}
