package classwork;

import java.util.*;

public class LinkedListMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// create object of LinkedList
		LinkedList ll = new LinkedList();
		
		// Initialize variable for cases and number num
		int ch;
		int num;
		int d;
		int pos;
		do
		{
			System.out.println("Enter your choice : ");
			System.out.println("1. Insert Node at first");
			System.out.println("2. Insert Node at Last");
			System.out.println("3. Insert by position ");
			System.out.println("4. Insert by sorted ");
			System.out.println("5. Insert before Data ");
			System.out.println("6. Insert after Data ");
			System.out.println("7. Delete First ");
			System.out.println("8. Delete Last ");
			System.out.println("9. Delete by Position ");
			System.out.println("10. Delete By Data ");
			System.out.println("11. Delete List ");
			System.out.println("12. Reverse LL");
			System.out.println("13. Count number of Nodes ");
			System.out.println("14. Print all Alternate nodes");
			System.out.println("15. Swap Alternate nodes ");
			System.out.println("16. Exit");
				
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
						System.out.println("Enter value : ");
						num = s.nextInt();
						System.out.println("Insert Position : ");
						pos = s.nextInt();
						ll.insert_byPos(num,pos);
						ll .display();
						
						break;
					case 4:
						System.out.println();
						System.out.println("Enter value : ");
						num = s.nextInt();
						ll.insertSorted(num);
						ll .display();
						
						break;
					case 5:
						System.out.println();
						System.out.println("Enter value : ");
						num = s.nextInt();
						System.out.println("Insert Position : ");
						pos = s.nextInt();
						ll.insertBefore(num,pos);
						ll .display();
						
						break;
					case 6: // Pending
						System.out.println();
						System.out.println("Enter value : ");
						num = s.nextInt();
						System.out.println("Insert Position : ");
						pos = s.nextInt();
						ll.insertBefore(num,pos);
						ll .display();
						
						break;
					case 7:
						System.out.println();
						ll.deleteFirst();
						ll .display();
						break;
					case 8:
						System.out.println();
						ll.deleteLast();
						ll.display();
						break;
					case 9:
						System.out.println();
						System.out.println("Enter Position : ");
						pos = s.nextInt();
						ll.deleteByPos(pos);
						ll.display();
						
						break;
					case 10:// pending
						break;
					case 11:
						System.out.println();
						ll.deletelist();
						ll.display();
						break;
					case 12:
						System.out.println();
						ll.reverseLinkedList();
						ll.display();
						break;
					case 13:
						break;
					case 14:
						System.out.println();
						ll.alternateNodes();
						ll.display();
						break;
					case 15: // swap alternate nodes
						System.out.println();
						ll.alternateNodes();
						ll.swapAlternateNodes();
						
						break;					

					default: 
						System.out.println("Invalid");
					}

				}while(ch != 16);
				
				s.close();
			}

}
