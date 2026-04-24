package classwork;

// create class of IntStack for Stack in integer value
public class IntStack {
	
	// Initialize variable
	/*
	 *  arr[] : create an empty array
	 *  top : create variable top to track position of pointer in array
	 */
	private int arr[];
	private int top;
	
	/*
	 * Default constructor
	 * initialize value of variable and array  
	 */
	public IntStack() 
	{
		top = -1;
		arr = new int[10];
	}
	
	/*
	 * Parameterized constructor with argument s to indicate length of array to be consider
	 */
	public IntStack(int s)
	{
		top = -1;
		arr = new int[s];
	}
	
	/*
	 * check if the array is full or not
	 * if full, return True by checking condition array.length - 1
	 * else return false
	 */
	public boolean isFull()
	{
		if(top == arr.length - 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/*
	 * push value in stack, 
	 * if its full, then show message to user that its overflow and return
	 * if not then push your element in your stack and increase pointer of stack to 1
	 */
	public int push(int n)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			return 0;
		}
		else
		{
		}
		top ++;
		arr[top] = n;
		return 0;
	}
	/*
	 * check if stack is empty or not
	 */
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * pop the element
	 * check if the array is empty or not
	 * if yes, then return default value
	 * else return the top/ current element in array and return that element
	 */
	public int pop() 
	{
		int d = -999;
		// check if array is empty or not
		if(isEmpty())
		{
			return d;
		}
		else
		{
			d = arr[top];
			top --;
			return d;
		}
	}
		
	/*
	 * another method to write pop method
	 * 
	 * public int pop() 
	{
		int d = -999;
		if(isEmpty())
		{
			d = arr[top];
			top --;
			return d;
		}
		else
		{
			return d;
		}
	}
	 * 
	 */
	
	/*
	 * return top most element in array stack
	 * return top most element in stack. 
	 * else return default value of stack
	 */
	public int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			return -999;
		}
	}

}
