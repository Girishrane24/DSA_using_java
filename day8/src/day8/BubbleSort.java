package day8;


public class BubbleSort {
	public static void bubbleSort(int arr[], int s)
	{
		int i,j,t,flag = 0;
		for(i = arr.length; i>0; i--)
		{
			for(j = 0; j<i-1 ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					flag = 1;
				}
			}
			if(flag == 0)
			{
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {2,1,23,4,5,64,33};
		System.out.println("Array is : ");
		
		for(int k = 0; k < arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
		bubbleSort(arr,arr.length);
		System.out.println();
		System.out.println("Sorted array is : ");
		
		for(int k = 0 ; k<arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
	}
}
