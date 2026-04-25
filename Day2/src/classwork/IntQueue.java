package classwork;

import java.util.Arrays;

/*
 * create new class IntQueue for Queue Data structure. 
 * 
 * Name of the class in this file:
 * IntQueue
 * UserIntQueue --> main class
 * 
 * 
 */
class IntQueue {
	// Initialize variable
	private int arr[];
	private int front;
	private int rear;
	
	// Constructor default 
	public IntQueue() 
	{
		// initialize default value of each parameter
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	// Parameterized constructor
	public IntQueue(int s)
	{
		arr = new int[s]; // get length of the queue in array 
		rear = front = -1;
	}
	
	// check if array is full or not
	public boolean isFull()
	{
		// check if rear index(pointer) is equal to (length of array - 1)
		if(rear == arr.length - 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	// Insert value in queue
	public void insertQ(int d)
	{
		// If queue is full, then return this error:  
		if(isFull())
		{
			System.out.println("Error.... Overflow occurs");
			return;
		}
		else
		{
			
		}
		// if front is at start location of array, then insert value inside the queue array
		System.out.println("Vlaue of front is : "+front);
		if(front == -1) 
			{
				front = 0; // locate front index to zero index
			}
			rear = rear + 1;  // increase rear index to 1
			System.out.println("rear value is : " + rear);
			arr[rear] = d; // add data inside array at rear location
			return;
			
	}
	// check if the queue is empty or not
	public boolean isEmpty()
	{
		// check if front is at -1 and no value added in queue, 
		// also check front = rear + 1; --> front is back side and rear is immediate next to front.
		if((front == -1) || (front == rear + 1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// delete value from the queue
	public int delQ()
	{
		int d = -999;
		// check if the array is empty or not, if yes then return default value of d
		if(isEmpty())
		{
			return d;
		}
		else
		{
			
		}
		// if queue is not empty, then get value of d from array
		// Increment value of front index(pointer), and return value of d
		d = arr[rear];
		rear ++ ;
		return d;
	}
	// get the current element in the queue.
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
	@Override
	public String toString() {
		return "IntQueue [arr=" + Arrays.toString(arr) + "\n, front=" + front + "\n, rear=" + rear + "]\n";
	}
	
	
}
	
