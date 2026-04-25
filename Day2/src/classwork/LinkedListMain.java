package classwork;

import java.util.*;

public class LinkedListMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i  = 0;
		
		LinkedList ll = new LinkedList();
		
		while(i < 10)
		{
			System.out.println("Enter value : ");
			int val = s.nextInt();
			
			ll.insertLast(val);
			ll.display();
		i ++;
		}
		
	s.close();
	}
}
