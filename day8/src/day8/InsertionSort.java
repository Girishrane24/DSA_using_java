package day8;

public class InsertionSort {

//	public static void insertionSort(int arr[])
//	{
//		for(int i = 1; i < arr.length - 1; i ++)
//		{
//			int k = arr[i];
//			int j = i - 1;
//			for(; j >=0 && k < arr[j]; j--)
//			{
//				arr[j + 1] = arr[j];
//			}
//			arr[j + 1] = k;
//		}
//	}
	
	public static void insertionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        
	        for (;j >= 0 && arr[j] > key;j--) {
	            arr[j + 1] = arr[j];
	            
	        }
	        arr[j + 1] = key;
	    }
	}
	public static void main(String[] args) {
		
		int arr[] = {2,1,23,4,5,64,33};
		System.out.println("Array is : ");
		
		for(int k = 0; k < arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
		insertionSort(arr);
		System.out.println();
		System. out.println("Sorted array is : ");
		
		for(int k = 0 ; k<arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
		
	}
	
}
