package classwork;

import java.util.Scanner;

public class MainStackString {	
	public static void main(String[] args) {
		
		// this will create new array of st with 8 element in array
		// this line call parameterized constructor of class IntStack.
		StringStack st = new StringStack(9);
	
		
		Scanner s = new Scanner(System.in);
		// Initialize variable for cases and number num
		int ch;
		String num;
		
		do
		{
			System.out.println("Enter your choice : ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. Exit");
			
			ch = s.nextInt(); // s.next().charAt(1);
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter your String : ");
				num = s.next();
				st.push(num);
				break;
			case 2:
				num = st.pop();
				if(num != "999")
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
				if(num != "999")
				{
					System.out.println("Value is  : " + num);
				}
				else
				{
					System.out.println("Stack is empty, please push any String");
				}
				break;
			case 4:
				break;
			
			default: 
				System.out.println("Invalid");
			}

			
		}while(ch != 4);
		
		s.close();
	}

}
