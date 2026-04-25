package classwork;

import java.util.Scanner;

public class UserCircular {
public static void main(String[] args) {
		
		// this will create new array of st with 8 element in array
		// this line call parameterized constructor of class IntStack.
		Circular st = new Circular(8);
	
		
		Scanner s = new Scanner(System.in);
		// Initialize variable for cases and number num
		int ch;
		int num;
		
		do
		{
			System.out.println("Enter your choice : ");
			System.out.println("1. insert element in queue");
			System.out.println("2. delete element from queue");
			System.out.println("3. get current element from the queue");
			System.out.println("4. Exit");
			
			ch = s.nextInt(); // s.next().charAt(1);
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter your number : ");
				num = s.nextInt();
				st.insertQ(num);
				break;
			case 2:
				num = st.deleteQ();
				if(num != -999)
				{
					System.out.println("Poped value is : " + num);
				}
				else
				{
					System.out.println("Stack is Empty");
				}
				break;
			case 3:
				num = st.peek();
				if(num != -999)
				{
					System.out.println("Value is  : " + num);
				}
				else
				{
					System.out.println("queue is empty, please push any number");
				}
				break;
			case 4:
				break;

			default: 
				System.out.println("Invalid");
			}

			System.out.println("Value of Array is : " + st);
			
		}while(ch != 4);
		
		s.close();
	}



}
