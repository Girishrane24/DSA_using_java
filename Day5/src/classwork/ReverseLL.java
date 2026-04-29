package classwork;

import java.util.Scanner;

public class ReverseLL {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		LinkedList ll = new LinkedList();
		
		int ch;
		int num;
		int d;
		int pos;
		do
		{
			System. out.println("Enter your choice : ");
			System.out.println("1. Insert Node at first");
			System.out.println("2. Insert Node at Last");
			System.out.println("3. Reverse LL");
			System.out.println("4. Exit");
				
			ch = s.nextInt(); 
					
					switch(ch)
					{
					case 1:
						System.out.println();
						System.out.println("Enter value : ");
						num = s.nextInt();
						ll.insertFirst(num);
						ll .display();
						break;
					case 2:
						System.out.println();
						System.out.println("Enter value : ");
						num = s.nextInt();
						ll.insertLast(num);
						ll .display();
						break;
					case 3:
						System.out.println();
						//head = ll.reverse(head);
					default:
						System.out.println("Invalid choice");
					}

				}while(ch != 4);
				
				s.close();
							
	}
}
