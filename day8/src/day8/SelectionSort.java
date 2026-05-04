package day8;

public class SelectionSort {
//	write method to sorting algorithm
	public static void selectionSort(int arr[])
	{
		// Initialize dummy variable
		int i,j, min,t;
		// Traverse from 0 to the length of the array
		for(i = 0; i< arr.length - 1; i++)
		{
//			assign the index to min
			min = i;
			// traverse from ( i + 1 )th element to the length of the array
			for(j = i + 1;j<arr.length;j++)
			{
				// check if the value of j is less than the value of the min index
				if(arr[j] < arr[min])
				{
//					assign the index to min 
					min = j;
				}
			}
//			for loop ended here
			
//			check if the min index is not equal to the index of j
			if(min != j)
			{
//				swap the element here
				t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
			}
		}
		
	} // end of method
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,2,1,4,78,53,32};
		System.out.println("array is : ");
		for(int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
		selectionSort(arr);
		System.out.println();
		System. out.println("After sorting : ");
		for(int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
		
	}
} // end of class
