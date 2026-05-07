package assignment;

import java.util.Scanner;

class Node{
	private int id;
	private String name;
	private int marks;
	
	public Node()
	{
		id = 0;
		name = "";
		marks = 0;
	}

	public Node(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

 class BubbleSort {
	public void bubbleSort(Node arr[], int s)
	{

//		int n = arr.length;
		int i,j,flag = 0;
		Node t;
		for(i = s; i>0; i--)
		{
			for(j = 0; j<i-1 ; j++)
			{
				
				/*
				 * Sorted by ID : 
				 */
//				if(arr[j].getId() > arr[j + 1].getId())
//				{
//					// consider t ans datatype node and arr as it is
//					t = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = t;
//					flag = 1;
//				}
				/*
				 * Sorted by Name : 
				 * 
				 */
				
		                // Compare names manually
		                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) 
		                {
		                    // Swap without temp array
		                    Node temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
//		            }
//		        }
		    
				
				/*
				 * 
				 * Sorted by Marks : 
				 * 
				 */
//				
//				if(arr[j].getMarks() > arr[j + 1].getMarks())
//				{
//					t = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = t;
//					flag = 1;
//				}
			}
			if(flag == 0)
			{
				break;
			}
		}
	}
}





public class UserSortingBubbleSortMain {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the number of users : ");
	int n = s.nextInt();
	Node arr[] = new Node[n];
	
	BubbleSort t = new BubbleSort();
	
	for(int i = 0; i<n;i++)
	{
		System.out.println("Enter ID : ");
		int id = s.nextInt();
		
		System.out.println("Enter name : ");
		String name = s.next();
		
		System.out.println("Enter Marks : ");
		int marks = s.nextInt();
		
		arr[i] = new Node(id,name,marks);
	}
	
	t.bubbleSort(arr, n);
	
	System.out.println(" values are : ");
	for(int j = 0; j < n; j++)
	{
		System.out.println(arr[j]);
	}
	s.close();
}
}
