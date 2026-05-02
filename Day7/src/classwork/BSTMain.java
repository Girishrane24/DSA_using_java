package classwork;

import java.util.Scanner;



public class BSTMain {
	public static void main(String[] args) {
		
		// Input from user:
		Scanner s = new Scanner(System.in);
		

		BinaryTree bt = new BinaryTree();
		
	
		int n;
		int d;
		
		do {
			// Enter the value : 
			System.out.println("1. Insert node in BST");
			System.out.println("2. Search node in BST");
			System.out.println("3. Display Tree");
			System.out.println("4. Recursive insert");
			System.out.println("5. Find Min");
			System.out.println("6. Find Max");
			System.out.println("7. Find Height");
			System.out.println("10. Exit");
			n = s.nextInt();
			
		switch(n)
		{
		case 1 : 
			// Enter data that you want to enter : 
			System.out.println("Enter your value : ");
			d = s.nextInt(); // get data from user
			
			// Call insert_nonrec function
			bt.insert_nonrec(d);
			break;
		
		case 2:
			// Enter data that you want to search
			System.out.println("Enter the data that you want to search : ");
			d = s.nextInt();
			//System.out.print(" ");
			bt.search(d);
			
			break;
			
		case 3:
			bt.disp_levelwise();
			break;
			
		case 4:
			System.out.println("Enter value of data : ");
			d = s.nextInt();
			bt.insert_recursive(d);
			break;
			
		case 5:
			int min_val = bt.binaryTreeMin();
			System.out.println("Minimum value is : " + min_val);
			break;
				
		case 6:
			int max_val = bt.binaryTreeMax();
			System.out.println("Maximum value is : " + max_val);
			break;
		
		case 7 : 
			System.out.println("Height of Tree is : ");
			bt.find_height(bt.getRoot());
			break;
			
		case 8:
			
		case 10:
			System.out.println("Exit");
			break;
			
			
			
		default:
			System. out.println("Exit Default value");
		}
		
		} while(n != 10);
		
		// close scanner
		s.close();
	}
}
